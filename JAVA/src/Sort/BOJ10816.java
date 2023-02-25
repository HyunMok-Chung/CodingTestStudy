package Sort;

import java.util.*;
import java.io.*;

public class BOJ10816 {  // 숫자 카드 2 (이분 탐색 활용 풀이, HashMap을 이요한 풀이도 가능함)
    public static int Low(int[] arr, int num){
        int start = 0;
        int end = arr.length;
        while(start<end){
            int mid = (start+end)/2;
            if(num<=arr[mid]){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }
    public static int High(int[] arr, int num){
        int start = 0;
        int end = arr.length;
        while(start<end){
            int mid = (start+end)/2;
            if(num<arr[mid]){
                end = mid;
            }else{ // 중복원소는 else에서 처리
                start = mid + 1;
            }
        }
        return start;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);  // 이분 탐색은 반드시 정렬되어 있어야함.
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<m;i++){
            int num = Integer.parseInt(st.nextToken());
            sb.append(High(arr, num) - Low(arr, num)).append(" ");
        }
        System.out.println(sb);
    }
}
