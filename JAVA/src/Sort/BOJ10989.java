package Sort;

import java.io.*;

public class BOJ10989 {  // 병합정렬 풀이
    public static int[] sorted = new int[10000001];

    public static void merge(int[] a, int m, int mid, int n){
        int i = m;
        int j = mid+1;
        int k = m;
        while(i<=mid && j<=n){
            if(a[i] <= a[j]){
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
                sorted[k]= a[t];
                k++;
            }
        }
        for(int t=m;t<=n;t++){
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
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for(int i=0;i<n;i++)
            arr[i] = Integer.parseInt(br.readLine());
        mergeSort(arr, 0, n-1);
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            sb.append(arr[i]).append("\n");
        }
        System.out.println(sb);
    }
}
