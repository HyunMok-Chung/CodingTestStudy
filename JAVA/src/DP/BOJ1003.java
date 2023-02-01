package DP;

import java.io.*;

public class BOJ1003 {  // 피보나치 함수
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        long[] d = new long[41];  //DP 배열 초기화
        StringBuilder sb = new StringBuilder();
        d[1] = 1;
        for (int i = 2; i <= 40; i++) {
            d[i] = d[i-2] + d[i-1];
        }
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            //0이면 1 0 출력
            if (n == 0) {  
                sb.append("1").append(" ").append("0").append("\n");
                continue;
            }
            sb.append(d[n-1]).append(" ").append(d[n]).append("\n");
        }
        System.out.print(sb);
    }
}
