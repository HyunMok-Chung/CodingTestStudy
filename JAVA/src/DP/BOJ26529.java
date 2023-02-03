package DP;

import java.io.*;

public class BOJ26529 {  // Bunnies
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            int x = Integer.parseInt(br.readLine());
            int[] dp = new int[x+2];
            if(x==0 || x==1)
                sb.append(1).append("\n");
            else{
                dp[1] = 1;
                dp[2] = 1;
                for(int j=3;j<=x+1;j++)
                    dp[j] = dp[j-1]+dp[j-2];
                sb.append(dp[x+1]).append("\n");
            }
        }
        System.out.print(sb);
    }
}
