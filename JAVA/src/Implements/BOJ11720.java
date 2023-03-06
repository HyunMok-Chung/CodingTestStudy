package Implements;

import java.io.*;

public class BOJ11720 {  // 숫자의 합 (단순 구현)
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int sum = 0;
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            sum += (c-'0');
        }
        sb.append(sum);
        System.out.println(sum);
    }
}
