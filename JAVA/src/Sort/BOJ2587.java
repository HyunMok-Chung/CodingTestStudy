package Sort;

// import java.util.*;
import java.io.*;

public class BOJ2587 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];
        int sum = 0;
        for(int i=0;i<5;i++){
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }
        int temp, index=0;
        for(int i=0;i<5;i++){
            int min = 101;
            for(int j=i;j<5;j++){
                if(min>arr[j]){
                    min = arr[j];
                    index = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(sum/5).append("\n");
        sb.append(arr[2]);
        System.out.println(sb);
    }
}
