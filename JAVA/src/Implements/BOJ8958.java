package Implements;

import java.io.*;

public class BOJ8958 {  // OX퀴즈 (단순 구현)
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            String s = br.readLine();
            int sum = 0;
            int num = 0;
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)=='O'){
                    num++;
                }else{
                    num=0;
                }
                sum += num;
            }
            sb.append(sum).append("\n");
        }
        System.out.print(sb);
    }
}
