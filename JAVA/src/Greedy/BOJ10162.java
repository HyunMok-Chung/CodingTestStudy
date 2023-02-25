package Greedy;

import java.io.*;

public class BOJ10162 {  // 전자레인지 (그리디 유형)
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        int[] btn = {300, 60, 10};
        int[] cnt = {0, 0, 0};
        if(t%10 != 0){
            sb.append(-1);
        }else{
            for(int i=0;i<3;i++){
                cnt[i] = t/btn[i];
                t %= btn[i];
                sb.append(cnt[i] + " ");
            }
        }
        System.out.println(sb);
    }
}
