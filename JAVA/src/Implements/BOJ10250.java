package Implements;

import java.util.*;
import java.io.*;

public class BOJ10250 {  // ACM 호텔 (수학, 구현 문제)
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++){
            st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken());
            // int w = Integer.parseInt(st.nextToken());
            // 조건을 따져봤을 때 w는 사용할 일이 없음.
            int n = Integer.parseInt(st.nextToken());
            if(n%h == 0){
                sb.append(h*100+ n/h).append("\n");
            }
            else{
                sb.append((n%h)*100 + ((n/h)+1)).append("\n");
            }
        }
        System.out.print(sb);
    }
}
