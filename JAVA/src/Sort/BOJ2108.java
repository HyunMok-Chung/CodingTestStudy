package Sort;

import java.util.*;
import java.io.*;

public class BOJ2108 {  // 통계학 실3
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[][] cnt = new int[4001][2];  // 입력횟수 카운트 배열
        int sum = 0;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
            if(arr[i]>0)
                cnt[arr[i]][0]++;
            else
                cnt[-1*arr[i]][1]++;
        }
        sb.append(Math.round((double)sum/n)).append("\n");  // 산술평균
        Arrays.sort(arr);
        sb.append(arr[n/2]).append("\n"); // 중앙값
        int max_cnt = 0;
        for(int i=0;i<cnt.length;i++){  // 최빈값
            for(int j=0;j<2;j++){
                if(cnt[i][j] == 0)
                    continue;
                if(cnt[i][j]>max_cnt)
                    max_cnt = cnt[i][j];
            }
        }
        ArrayList<Integer> num = new ArrayList<>();
        for(int i=0;i<cnt.length;i++){
            for(int j=0;j<2;j++){
                if(cnt[i][j] == 0)
                    continue;
                if(cnt[i][j] == max_cnt){
                    if(j==0)
                        num.add(i);
                    else
                        num.add(-1*i);
                }
            }
        }
        Collections.sort(num);
        if(num.size()>1)
            sb.append(num.get(1)).append("\n");
        else
            sb.append(num.get(0)).append("\n");
        sb.append(arr[n-1]-arr[0]).append("\n"); // 범위
        System.out.print(sb);
    }
}
