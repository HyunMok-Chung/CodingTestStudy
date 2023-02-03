package DP;

import java.util.*;
import java.io.*;

public class BOJ12865 {  // 배낭 문제(유명한 DP 문제, 중요)
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] w = new int[n+1];  // 무게
        int[] v = new int[n+1];  // 가치
        int[][] dp = new int[n+1][k+1];
        for(int i=1;i<=n;i++){
            st = new StringTokenizer(br.readLine());
            w[i] = Integer.parseInt(st.nextToken());
            v[i] = Integer.parseInt(st.nextToken());
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=k;j++){
                if(w[i]>j)  // i 번째 무게를 더 담을 수 없는 경우
                    dp[i][j] = dp[i-1][j];
                else{  // i 번째 무게를 더 담을 수 있는 경우
                    dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-w[i]] + v[i]);
                }
            }
        }
        System.out.println(dp[n][k]);
    }
}
