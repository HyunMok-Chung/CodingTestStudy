package Array;

import java.util.*;
import java.io.*;

public class BOJ2738 {  // 행렬 덧셈 (행렬 연습)
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        // int[][] a = new int [n][m];
        // int[][] b = new int [n][m];
        int[][] add = new int[n][m];
        for(int i=0;i<2;i++){
            for(int j=0;j<n;j++){
                st = new StringTokenizer(br.readLine());
                for(int k=0;k<m;k++){
                    if(i==1)
                        add[j][k] += Integer.parseInt(st.nextToken());
                    else
                        add[j][k] = Integer.parseInt(st.nextToken());
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(j == m-1)
                    sb.append(add[i][j]).append("\n");
                else
                    sb.append(add[i][j]).append(" ");
            }
        }
        System.out.print(sb);
    }
}
