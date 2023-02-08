package BruteForce;

import java.util.*;
import java.io.*;

public class BOJ1051 { // 숫자 정사각형
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][m];
        for(int i=0;i<n;i++){
            String num = br.readLine();
            for(int j=0;j<m;j++){
                arr[i][j] = num.charAt(j)-'0';
            }
        }
        int len = Math.min(n, m); // 정사각형의 최대 길이 = n m 중 더 작은 것.
        int max = 1;
        while(len > 1) {
            for(int i=0; i<= n-len; i++) {
                for(int j=0; j<=m-len; j++) {
                    int num = arr[i][j];
                    // 꼭짓점 3군데 비교
                    if(num==arr[i][j+len-1] && num == arr[i+len-1][j] && num == arr[i+len-1][j+len-1]) {
                        max = Math.max(max, len);
                    }
                }
            }
            len--;
        }
        System.out.println(max*max);
    }
}
