package Greedy;

import java.util.*;
import java.io.*;

public class BOJ1026 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        int[] b = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            a[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(a);
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            b[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(b);
        int sum = 0;
        for(int i=0;i<n;i++){
            sum += a[i]*b[n-1-i];
        }
        System.out.println(sum);
    }
}
