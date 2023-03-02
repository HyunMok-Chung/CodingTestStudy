package Sort;

import java.util.*;
import java.io.*;

public class BOJ10815 {  // 숫자 카드 (이분 탐색 활용)
    public static int[] arr;
    public static boolean binary(int num){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(num == arr[mid]){
                return true;
            }else if(num>arr[mid]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return false;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<m;i++){
            int key = Integer.parseInt(st.nextToken());
            if(binary(key)){
                sb.append(1).append(" ");
            }else{
                sb.append(0).append(" ");
            }
        }
        System.out.println(sb);
    }
}
