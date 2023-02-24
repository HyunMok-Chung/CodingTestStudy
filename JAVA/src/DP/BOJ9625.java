package DP;

import java.io.*;

public class BOJ9625 {
    // BABBA (수의 규칙을 찾는 문제, 피보나치 수열이 나타남)
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        int[][] dp = new int[2][46];
        dp[0][2] = 1;
        dp[1][1] = 1;
        dp[1][2] = 1;
        for(int i=3;i<=k;i++){
            dp[0][i] = dp[0][i-2] + dp[0][i-1];
            dp[1][i] = dp[1][i-2] + dp[1][i-1];
        }
        System.out.println(dp[0][k] + " " + dp[1][k]);
    }
}
