package Sort;

import java.util.*;
import java.io.*;

public class BOJ10989_2 {  // 계수 정렬 풀이
    // 데이터의 개수가 많고 수의 범위가 제한적으로 주어진 문제에서는 계수 정렬 방법이 좋음.
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] num = new int[10001];
        Arrays.fill(num, 0);
        for(int i=0;i<n;i++){
            int a = Integer.parseInt(br.readLine());
            num[a-1]++;
        }
        br.close();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<10000;i++){
            if(num[i]!=0){
                for(int j=0;j<num[i];j++)
                    sb.append(i+1).append("\n");
            }
        }
        System.out.print(sb);
    }
}
