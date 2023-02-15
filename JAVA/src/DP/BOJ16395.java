package DP;

import java.util.*;
import java.io.*;

public class BOJ16395 {  // 파스칼의 삼각형
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[][] dp = new int [n+1][n+1];
        dp[1][1] = 1;
        for(int i=2;i<n+1;i++){
            for(int j=1;j<n+1;j++){
                dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
            }
        }
        System.out.println(dp[n][k]);
    }
}