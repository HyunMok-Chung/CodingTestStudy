package Implements;

import java.io.*;

public class BOJ2577 {  // 숫자의 개수 (단순 구현)
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];
        int num = Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine());
        // num을 String형으로 바꾼 후 각 자리 숫자에 해당하는 수의 위치에 1씩 더해 결과 출력
        String str = String.valueOf(num);
        for(int i=0;i<str.length();i++){
            arr[(str.charAt(i)-'0')]++;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
