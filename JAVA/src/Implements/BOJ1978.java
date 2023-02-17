package Implements;

import java.io.*;
import java.util.*;

public class BOJ1978 {  // 소수 찾기 (제곱근 이용)
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int cnt = 0;
        for(int i=0;i<n;i++){
            boolean prime = true;
            int num = Integer.parseInt(st.nextToken());
            if(num==1)
                continue;
            for(int j=2;j<=Math.sqrt(num);j++){
                if(num%j == 0){
                    prime = false;
                    break;
                }
            }
            if(prime)
                cnt++;
        }
        System.out.println(cnt);
    }
}
