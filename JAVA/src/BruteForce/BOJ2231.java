package BruteForce;

import java.io.*;

public class BOJ2231 {  // 분해합
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i=n-String.valueOf(n).length()*9;i<=n;i++){
            int num = i;
            int sum = 0;
            while(num != 0){
                sum += (num%10);
                num /= 10;
            }
            if((sum + i) == n){
                System.out.println(i);
                return;
            }else if(i == n){
                System.out.println(0);
            }
        }
    }
}
