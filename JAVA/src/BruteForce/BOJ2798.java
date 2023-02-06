package BruteForce;

import java.io.*;
import java.util.*;

public class BOJ2798 {  // 블랙잭
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] card = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            card[i] = Integer.parseInt(st.nextToken());
        }
        int max = 0;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    int sum = card[i]+card[j]+card[k];
                    if(sum<=m)
                        max = Math.max(sum, max);
                }
            }
        }
        System.out.println(max);
    }
}
