package Implements;

import java.util.*;
import java.io.*;

public class BOJ9020 {  // 골드바흐의 추측 (에라토스테네스의 체)
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int num = 10001;
        int[] prime = new int[num];
        Arrays.fill(prime, 1);
        prime[0] = prime[1] = 0;
        for(int i=2;i<=Math.sqrt(num);i++){
            if(prime[i] == 1){
                int j = 2;
                while(i*j<num){
                    prime[i*j] = 0;
                    j++;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<t;i++){
            int n = Integer.parseInt(br.readLine());
            for(int j=n/2;j>=2;j--){
                if(prime[j] == 1 && prime[n-j] == 1){
                    sb.append(j+" "+(n-j)).append("\n");
                    break;
                }
            }
        }
        System.out.print(sb);
    }
}
