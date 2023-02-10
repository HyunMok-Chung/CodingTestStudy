package DP;

import java.io.*;

public class BOJ9655 {  // 돌 게임 3
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        if(n%2==1)
            sb.append("SK");
        else
            sb.append("CY");
        System.out.println(sb);
    }
}
