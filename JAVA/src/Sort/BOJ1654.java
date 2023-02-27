package Sort;

import java.util.*;
import java.io.*;

public class BOJ1654 {  // 랜선 자르기 (이분 탐색)
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[k];
        long max = 0;
        for(int i=0;i<k;i++){
            arr[i] = Integer.parseInt(br.readLine());
            max = Math.max(max, arr[i]);
        }
        long min = 1;  // 탐색 길이의 최솟값
        while(min<=max){
            long mid = (max + min) / 2;
            long cnt = 0;
            for(int i=0;i<arr.length;i++){
                cnt += arr[i]/mid;
                // 중간 길이로 잘라서 총 랜선 길이를 구함.
            }
            if(cnt>=n){  // 개수가 만들고자 하는 개수보다 크면 길이를 늘려줌
                min = mid+1;
            }else if(cnt<n){
                max = mid-1;
            }
        }
        System.out.println(max);
    }
}
