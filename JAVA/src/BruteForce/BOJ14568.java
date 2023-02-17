package BruteForce;

import java.io.*;

public class BOJ14568 {  // 연세대학교 프로그래밍 경시대회
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        for(int i=1;i<=n;i++){
            int b = i;
            for(int j=i+2;j<=n-1;j++){
                int c = j;
                int a = n-i-j;
                if(a%2 == 0 && a>0 && a+b+c==n)
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
