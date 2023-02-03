package DP;

import java.io.*;

public class BOJ2839 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        while(true){
            if(n%5 == 0){
                sb.append(n/5).append("\n");
                break;
            }
            if(n<0){
                sb.append(-1).append("\n");
                break;
            }
            n -= 3;
            cnt++;
            if(n%5 == 0){
                sb.append(cnt+n/5).append("\n");
                break;
            }
        }
        System.out.print(sb);
    }
}
