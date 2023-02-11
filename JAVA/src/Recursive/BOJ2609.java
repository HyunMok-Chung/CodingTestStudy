package Recursive;

import java.util.*;
import java.io.*;

public class BOJ2609 {  // 최대공약수와 최소공배수
    public static int GCD(int a, int b){
        if(a%b == 0)
            return b;
        else
            return GCD(b, a%b);
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int gcd = 0; int lcm = 0;
        if(a>b){
            gcd = GCD(a, b);
            lcm = (a*b)/gcd;
        }else{
            gcd = GCD(b,a);
            lcm = (a*b)/gcd;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(gcd).append("\n").append(lcm);
        System.out.println(sb);
    }
}
