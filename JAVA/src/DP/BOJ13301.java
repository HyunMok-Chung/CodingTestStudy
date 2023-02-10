package DP;

import java.io.*;

public class BOJ13301 {  // 타일 장식물
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] dp = new long[n];
        if(n==1){
            System.out.println(4);
            return;
        }
        dp[0] = 1;
        dp[1] = 1;
        for(int i=2;i<n;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        System.out.println(2*dp[n-1] + 2*(dp[n-1]+dp[n-2]));
    }
}
