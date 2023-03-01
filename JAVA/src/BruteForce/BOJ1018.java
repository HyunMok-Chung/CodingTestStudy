package BruteForce;

import java.util.*;
import java.io.*;

public class BOJ1018 {  // 체스판 다시 칠하기 (브루트 포스, 완전 탐색)
    public static boolean[][] arr;
    public static int min = 64;

    public static void ColorChess(int a, int b){  // 다시 칠해야하는 개수 구하는 함수
        int cnt = 0;
        boolean check = arr[a][b];  // 처음 칸의 색 (비교 기준이 됨)
        for(int i=a;i<a+8;i++){
            for(int j=b;j<b+8;j++){
                if(arr[i][j] != check){
                    cnt++;
                }
                check = !check;  // 진행되면서 색이 바뀌기 때문에 바꿔주어야함.
            }
            check = !check;  // 다음 줄의 첫 색도 바뀌기 때문에 변경
        }
        cnt = Math.min(cnt, 64-cnt);  // 첫 번째 칸의 색깔이 다를 경우와 비교. 즉, 반대의 경우
        min = Math.min(cnt, min);  // 경우의 수 만큼 반복하며 최소값 갱신.
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        arr = new boolean[n][m];
        for(int i=0;i<n;i++){
            String s = br.readLine();
            for(int j=0;j<m;j++){
                if(s.charAt(j) == 'W'){ // W일 때는 true
                    arr[i][j] = true;
                }else{  // 아니면 false
                    arr[i][j] = false;
                }
            }
        }
        for(int i=0;i<n-7;i++){  // 경우의 수는 가로-7 * 세로-7이기 때문에 
            for(int j=0;j<m-7;j++){  // n-7, m-7로 반복 수행
                ColorChess(i, j);
            }
        }
        System.out.println(min);
    }
}
