package Implements;

import java.io.*;
import java.util.*;

public class BOJ15965 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] prime = new int[10000001];
        Arrays.fill(prime, 1);
        for(int i=2;i<=Math.sqrt(prime.length);i++){
            if(prime[i] == 1){
                for(int j=i*i;j<prime.length;j+=i){
                    prime[j] = 0;
                }
            }
        }
        int k = Integer.parseInt(br.readLine());
        int cnt = 0;
        for(int i=2;i<prime.length;i++){
            if(prime[i]==1){
                cnt++;
            }
            if(cnt == k){
                sb.append(i).append("\n");
                break;
            }
        }
        System.out.print(sb);
    }
}
