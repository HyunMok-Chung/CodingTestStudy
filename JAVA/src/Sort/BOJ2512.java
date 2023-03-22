package Sort;

import java.io.*;
import java.util.*;

public class BOJ2512 {  // 예산 (이분 탐색 문제)
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int m = Integer.parseInt(br.readLine());
        Arrays.sort(arr);
        int l = 0;
        int r = arr[n-1];
        while(l<=r){
            int mid = (l+r)/2;
            long budget = 0;
            for(int i=0;i<n;i++){
                if(arr[i]>mid){
                    budget += mid;
                }else{
                    budget += arr[i];
                }
            }
            if(budget<=m){
                l = mid + 1;
            }else{
                r = mid - 1;
            }
        }
        System.out.println(r);
    }
}
