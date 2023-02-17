package Greedy;

import java.util.*;
import java.io.*;

public class BOJ2217 {  // 로프
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> rope = new ArrayList<>();
        for(int i=0;i<n;i++){
            rope.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(rope);
        int max = 0;
        for(int i=0;i<n;i++){
            max = Math.max(max, rope.get(i)*(n-i));
        }
        System.out.println(max);
    }
}
