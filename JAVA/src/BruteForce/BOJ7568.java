package BruteForce;

import java.util.*;
import java.io.*;

public class BOJ7568 {  // 덩치
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();
        int n =Integer.parseInt(br.readLine());
        int[][] body = new int[n][2];
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            body[i][0] = Integer.parseInt(st.nextToken());
            body[i][1] = Integer.parseInt(st.nextToken());
        }
        for(int i=0;i<n;i++){
            int cnt = 0;
            for(int j=0;j<n;j++){
                if(body[i][0]<body[j][0] && body[i][1]<body[j][1])
                    cnt++;
            }
            sb.append(cnt+1).append(" ");
        }
        System.out.println(sb);
    }
}
