package DP;

import java.util.*;
import java.io.*;

public class BOJ1010 {  // 다리놓기
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        int t = Integer.parseInt(br.readLine());
        int[][] dp = new int[30][30];
        for(int i=0;i<30;i++){
            dp[i][i] = 1;
            dp[i][0] = 1;
        }
        for(int i=2;i<30;i++){
            for(int j=1;j<30;j++){
                dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<t;i++){
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            sb.append(dp[m][n]).append("\n");
        }
        System.out.print(sb);
    }
}
