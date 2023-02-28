package Implements;

import java.util.*;
import java.io.*;

public class BOJ2567 {  // 색종이2 (구현)
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[101][101];
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            for(int j=x;j<x+10;j++){
                for(int k=y;k<y+10;k++){
                    arr[j][k] = 1;
                }
            }
        }
        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};
        int cnt = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j] == 1){
                    for(int k=0;k<4;k++){
                        int nx = i + dx[k];
                        int ny = j + dy[k];
                        // 자신이 1이고 주변이 0이면 둘레이므로 cnt++
                        if(arr[nx][ny] == 0)
                            cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}
