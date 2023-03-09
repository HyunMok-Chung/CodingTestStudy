package Sort;

import java.io.*;
import java.util.*;

public class BOJ2805 {  // 나무 자르기 (이분탐색) : 랜선 자르기와 유사 문제
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] tree = new int[n];
        int min = 0; int max = 0;
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            tree[i] = Integer.parseInt(st.nextToken());
            if(max<tree[i])
                max = tree[i];
                // 이분 탐색에서 사용할 최대 길이의 나무를 구함.
        }
        while(min<max){
            long sum = 0;
            int mid = (min+max)/2;
            for(int i=0;i<n;i++){
                // 잘린 길이의 합을 구함.
                if(tree[i]-mid>0){
                    sum += (tree[i]-mid);
                }
            }
            if(sum<m){
                // 잘린 길이의 합이 m보다 작은 것 = 자르는 높이가 높다는 것. 즉, 높이를 낮춰줘야함.
                max = mid;
            }else{
                // 잘린 길이의 합이 m보다 큰 것 = 자르는 높이가 낮다. 즉, 높이를 높여줘야함.
                min = mid+1;
            }
        }
        System.out.println(max-1);
    }
}
