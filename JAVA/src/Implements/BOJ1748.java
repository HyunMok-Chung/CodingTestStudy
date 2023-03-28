package Implements;

import java.io.*;

public class BOJ1748 { // 수 이어 쓰기1(간단 구현)
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;  // 결과값
        int num = 10;  // 몇 자릿수인지 판단할 값
        int place = 1;  // 자릿수에 더하는 값
        for(int i=1;i<=n;i++){
            if(i%num == 0){
                place++;
                num *= 10;
            }
            cnt += place;
        }
        System.out.println(cnt);
    }
}
