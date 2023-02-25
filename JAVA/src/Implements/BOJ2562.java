package Implements;

import java.io.*;

public class BOJ2562 {  // 최댓값
    // 배열 없이 풀이 가능
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0; int idx = 0;
        for(int i=0;i<9;i++){
            int num = Integer.parseInt(br.readLine());
            if(num>max){
                max = num;
                idx = i+1;
            }
        }
        System.out.println(max);
        System.out.println(idx);
    }
}
