package DP;

import java.io.*;

public class BOJ2748 {  // 피보나치 수 2
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] dp = new long[n+1];
        dp[1] = 1;
        dp[2] = 1;
        for(int i=3;i<=n;i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        StringBuilder sb = new StringBuilder();
        sb.append(dp[n]);
        System.out.println(sb);
    }
}
