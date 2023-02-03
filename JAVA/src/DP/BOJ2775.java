package DP;

import java.io.*;

public class BOJ2775 {  // 부녀회장이 될꺼야!
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int[][] dp = new int[15][15];
        for(int j=0;j<15;j++){
            dp[0][j] = j;  // 0층 j호
            dp[j][1] = 1;  // j층 1호
        }
        for(int i=1;i<15;i++){  // 1층부터 14층
            for(int j=2;j<15;j++){  // 2호부터 14호
                dp[i][j] = dp[i][j-1] + dp[i-1][j];
            }
        }

        for(int i=0;i<t;i++){
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            sb.append(dp[k][n]).append("\n");
        }
        System.out.print(sb);
    }
}
