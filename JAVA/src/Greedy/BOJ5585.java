package Greedy;

import java.io.*;

public class BOJ5585 {  // 거스름돈
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] coin = {500, 100, 50, 10, 5, 1};
        n = 1000-n;
        int cnt = 0;
        for(int i=0;i<6;i++){
            if(n/coin[i]>0){
                cnt += n/coin[i];
                n %= coin[i];
            }
        }
        System.out.println(cnt);
    }
}
