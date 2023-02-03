package DP;

import java.io.*;

public class BOJ14916 {  // 거스름돈 (DP로 안풀어도 풀림)
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        br.close();
        int dp = 0;
        while(true){
            if(n%5 == 0){
                sb.append(n/5);
                break;
            }
            if(n==0){
                sb.append(0);
                break;
            }
            if(n<0){
                sb.append(-1);
                break;
            }
            n -= 2;
            dp++;
            if(n%5 == 0){
                dp += n/5;
                sb.append(dp);
                break;
            }
        }
        System.out.println(sb);
    }
}
