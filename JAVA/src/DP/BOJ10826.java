package DP;

import java.io.*;
import java.math.BigInteger;

public class BOJ10826 {  // 피보나치 수 4 (BitInteger 사용 문제)
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        if(n==0)
            sb.append(0);
        else if(n==1 || n==2)
            sb.append(1);
        else{
            BigInteger[] dp = new BigInteger[n+1];
            dp[1] = new BigInteger("1");
            dp[2] = new BigInteger("1");
            for(int i=3;i<=n;i++){
                dp[i] = dp[i-1].add(dp[i-2]);
            }
            sb.append(dp[n]);
        }
        System.out.println(sb);
    }
}
