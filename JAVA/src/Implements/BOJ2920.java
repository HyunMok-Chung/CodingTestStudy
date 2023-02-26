package Implements;

import java.util.*;
import java.io.*;

public class BOJ2920 {  // 음계 (단순 구현 문제)
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[8];
        for(int i=0;i<8;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        String s = "";
        for(int i=0;i<7;i++){
            if(arr[i]==arr[i+1]+1){
                s = "descending";
            }else if(arr[i] == arr[i+1]-1){
                s = "ascending";
            }else{
                s = "mixed";
                break;
            }
        }
        System.out.println(s);
    }
}
