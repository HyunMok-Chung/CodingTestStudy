package Implements;

import java.util.*;
import java.io.*;

public class BOJ6588 {  // 골드바흐의 추측 (에라토스테네스의 체 이용)
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = 1000001;
        int[] prime = new int[num];
        Arrays.fill(prime, 1);
        prime[0] = prime[1] = 0;
        for(int j=2;j<=Math.sqrt(num);j++){
            if(prime[j] == 1){
                int k = 2;
                while(j*k<num){
                    prime[j*k] = 0;
                    k++;
                }
            }
        }
        while(true){
            int n = Integer.parseInt(br.readLine());
            if(n==0)
                break;
            for(int j=3;j<=n/2;j++){
                if(j%2 == 0)
                    continue;
                if(prime[j] == 1 && (n-j)%2 != 0 && prime[n-j] == 1){
                    sb.append(n + " = ");
                    sb.append(j).append(" + ").append(n-j).append("\n");
                    break;
                }
            }
        }
        System.out.print(sb);
    }
}
