package BruteForce;

import java.io.*;
import java.util.*;

public class BOJ1969 {  // DNA (브루트포스)
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String[] dna = new String[n];
        for(int i=0;i<n;i++){
            dna[i] = br.readLine();
        }
        int sum = 0;
        for(int i=0;i<m;i++){
            int max = 0;
            int maxIdx = 0;
            int[] arr = new int[4];  // A, C, G, T
            // 사전 순으로 출력해야하기 때문에 사전 순으로 값을 증가시킨다.
            for(int j=0;j<n;j++){
                if(dna[j].charAt(i) == 'A'){
                    arr[0]++;
                }else if(dna[j].charAt(i) == 'C'){
                    arr[1]++;
                }else if(dna[j].charAt(i) == 'G'){
                    arr[2]++;
                }else{
                    arr[3]++;
                }
            }
            for(int j=0;j<4;j++){
                if(arr[j]>max){
                    max = arr[j];
                    maxIdx = j;
                }
            }
            if(maxIdx == 0){
                sb.append("A");
            }else if(maxIdx == 1){
                sb.append("C");
            }else if(maxIdx == 2){
                sb.append("G");
            }else sb.append("T");
            for(int j=0;j<4;j++){
                if(j != maxIdx)
                    sum += arr[j];
            }
        }
        sb.append("\n").append(sum).append("\n");
        System.out.print(sb);
    }
}
