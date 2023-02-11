package Implements;

import java.io.*;

public class BOJ1259 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true){
            String s = br.readLine();
            if(s.equals("0"))
                break;
            int len = s.length();
            boolean res = true;
            for(int i=0;i<len/2;i++){
                if(s.charAt(i) != s.charAt(len-1-i))
                    res = false;
            }
            if(res)
                sb.append("yes").append("\n");
            else
                sb.append("no").append("\n");
        }
        System.out.print(sb);
    }
}
