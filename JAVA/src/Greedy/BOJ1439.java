package Greedy;

import java.io.*;

public class BOJ1439 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int cnt0 = 0; int cnt1 = 0;
        if(s.charAt(0) == '0'){
            cnt0++;
        }else{
            cnt1++;
        }
        for(int i=1;i<s.length();i++){
            if(s.charAt(i-1) != s.charAt(i)){
                if(s.charAt(i) == '0'){
                    cnt0++;
                }else{
                    cnt1++;
                }
            }
        }
        System.out.println(Math.min(cnt0, cnt1));
    }
}
