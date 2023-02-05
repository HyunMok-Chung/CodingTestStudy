package BruteForce;

import java.io.*;

public class BOJ1065 {  // 한수
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        for(int i=1;i<=n;i++){
            if(i<=99){
                cnt++;
            }else if(i<=999){
                int a = i/100;
                int b = (i%100)/10;
                int c = i%10;
                if(a-b == b-c)
                    cnt++;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(cnt).append("\n");
        System.out.print(sb);
    }
}
