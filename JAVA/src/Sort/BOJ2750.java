package Sort;

import java.util.*;
import java.io.*;

public class BOJ2750 {  // 수 정렬하기
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[1001];
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        int index = 0, temp;  // 선택정렬
        for(int i=0;i<n;i++){
            int min = 1001;
            for(int j=i;j<n;j++){
                if(min>arr[j]){
                    min = arr[j];
                    index = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
