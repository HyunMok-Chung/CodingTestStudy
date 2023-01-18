package Sort;

import java.io.*;
import java.util.*;

public class BOJ2752 { // 세수정렬 (선택정렬 풀이)
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[3];
        for(int i=0;i<3;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int min, index=0, temp;
        for(int i=0;i<3;i++){
            min = 1000001;
            for(int j=i;j<3;j++){
                if(min>arr[j]){
                    min = arr[j];
                    index=j;
                }
            }
            temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        for(int i=0;i<3;i++)
            System.out.print(arr[i]+ " ");
        System.out.println();
    }
}
