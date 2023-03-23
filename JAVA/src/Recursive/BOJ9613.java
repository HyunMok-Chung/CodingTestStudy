package Recursive;

import java.io.*;
import java.util.*;

public class BOJ9613 {  // GCD(최대공약수) 합 (재귀 활용, 유클리드 호제법)
    public static int GCD(int a, int b){
        if(a%b == 0){
            return b;
        }else{
            return GCD(b, a%b);
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++){
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            long sum = 0;
            // 100개의 케이스에 모든 수가 1000000이라면 int 범위를 넘는다.
            // 따라서 long타입으로 선언해야함.
            int[] arr = new int[n];
            for(int j=0;j<n;j++){
                arr[j] = Integer.parseInt(st.nextToken());
            }
            for(int j=0;j<arr.length-1;j++){
                for(int k=j+1;k<arr.length;k++){
                    sum += GCD(arr[j], arr[k]);
                }
            }
            sb.append(sum).append("\n");
        }
        System.out.print(sb);
    }
}
