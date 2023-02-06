package BruteForce;

import java.util.*;
import java.io.*;

public class BOJ1120 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String a = st.nextToken();
        String b = st.nextToken();
        int min = a.length();
        for(int i=0;i<=b.length()-a.length();i++){
            int cnt = 0;
            for(int j=0;j<a.length();j++){
                if(a.charAt(j) != b.charAt(j+i))
                    cnt++;
            }
            min = Math.min(min, cnt);
        }
        System.out.println(min);
    }
}
