package Implements;

import java.util.*;
import java.io.*;

public class BOJ2563 { // 색종이 (구현)
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[101][101];
        int cnt = 0;
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            for(int j=x;j<x+10;j++){
                for(int k=y;k<y+10;k++){
                    // 색종이가 덮혀지는 범위만 체크해서 1씩 더해줌.
                    // 이미 덮혀져있는 부분은 신경 X
                    if(arr[j][k] == 0){
                        arr[j][k] = 1;
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}
