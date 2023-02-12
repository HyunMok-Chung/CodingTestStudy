package Sort;

import java.util.*;
import java.io.*;

public class BOJ1920 {  // 수 찾기 (이진(이분)) 탐색 이용 풀이)
    // 이분탐색을 사용하려면 비교 대상인 배열이 정렬되어 있어야한다.
    public static int binary(int[] arr, int target, int start, int end){
        while(start<=end){
            int mid = (start+end)/2;
            if(target<arr[mid]){
                end = mid-1;
            }else if(target>arr[mid]){
                start = mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            a[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(a);
        int m = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<m;i++){
            int res = binary(a, Integer.parseInt(st.nextToken()), 0, n-1);
            if(res>=0){
                sb.append(1).append("\n");
            }else{
                sb.append(0).append("\n");
            }
        }
        System.out.print(sb);
    }
}
