package Sort;

import java.io.*;
import java.util.*;

public class BOJ14400 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        int n = Integer.parseInt(br.readLine());
        int[] x = new int[n];
        int[] y = new int[n];
        long sum = 0;
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(x); Arrays.sort(y);
        for(int i=0;i<n;i++){
            sum += Math.abs(x[n/2]-x[i])+Math.abs(y[n/2]-y[i]);
        }
        System.out.println(sum);
    }
}
