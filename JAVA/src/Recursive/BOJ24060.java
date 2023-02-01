package Recursive;

import java.util.*;
import java.io.*;

public class BOJ24060 {  // 알고리즘 수업 - 병합 정렬1(병합 정렬 구현)
    static int K;
    static int[] sorted;
    static int cnt = 0;
    static int result = -1;

    public static void merge(int[] a, int m, int mid, int n){
        int i = m;
        int j = mid+1;
        int k = m;
        while(i<=mid && j<=n){
            if(a[i]<=a[j]){
                sorted[k] = a[i];
                i++;
            }else{
                sorted[k] = a[j];
                j++;
            }
            k++;
        }
        if(i>mid){
            for(int t=j;t<=n;t++){
                sorted[k] = a[t];
                k++;
            }
        }else{
            for(int t=i;t<=mid;t++){
                sorted[k] = a[t];
                k++;
            }
        }
        for(int t=m; t<=n;t++){
            cnt++;
            if(cnt == K){
                result = sorted[t];
                break;
            }
            a[t] = sorted[t];
        }
    }
    public static void mergeSort(int[] a, int m, int n){
        if(m<n){
            int mid = (m+n)/2;
            mergeSort(a, m, mid);
            mergeSort(a, mid+1, n);
            merge(a, m, mid, n);
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        int[] a = new int[n];
        sorted = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++)
            a[i] = Integer.parseInt(st.nextToken());
        mergeSort(a, 0, n-1);
        System.out.println(result);
    }
}
