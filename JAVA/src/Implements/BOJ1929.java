package Implements;

import java.util.*;
import java.io.*;

public class BOJ1929 { // 소수 구하기 (에라토스테네스의 체 이용)
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        boolean[] prime = new boolean[n+1];
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false; // m의 범위가 0부터임으로 예외처리
        for(int i=2;i<=Math.sqrt(n);i++){
            if(prime[i]==true){
                int j = 2;
                while(i*j<=n){
                    prime[i*j] = false;
                    j++;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=m;i<=n;i++){
            if(prime[i] == true)
                sb.append(i).append("\n");
        }
        System.out.print(sb);
    }
}
