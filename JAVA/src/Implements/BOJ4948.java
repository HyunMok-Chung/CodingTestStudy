package Implements;

import java.util.*;
import java.io.*;

public class BOJ4948 {  // 베르트랑 공준 (에라토스테네스의 체)
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = 246913;
        int[] prime = new int[num];
        Arrays.fill(prime, 1);
        prime[0] = prime[1] = 0;
        for(int i=2;i<=Math.sqrt(num);i++){
            if(prime[i] == 1){
                int j=2;
                while(i*j<num){
                    prime[i*j] = 0;
                    j++;
                }
            }
        }
        while(true){
            int n = Integer.parseInt(br.readLine());
            if(n==0)
                break;
            int cnt = 0;
            for(int i=n+1;i<=2*n;i++){
                if(prime[i]==1)
                    cnt++;
            }
            sb.append(cnt).append("\n");
        }
        System.out.print(sb);
    }
}
