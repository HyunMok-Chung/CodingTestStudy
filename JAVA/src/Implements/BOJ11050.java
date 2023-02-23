package Implements;

import java.util.*;
import java.io.*;

public class BOJ11050 {  // 이항 계수 1 (팩토리얼 이용, DP풀이도 가능)
    public static int fac(int n) {
        int i=1;
        for(int j=1; j<=n; j++) {
            i *= j;
        }
        return i;
    } 
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        System.out.println(fac(n)/(fac(n-k)*fac(k)));
    }
}
