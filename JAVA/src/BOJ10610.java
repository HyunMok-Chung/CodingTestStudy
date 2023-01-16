import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10610 { // 30의 배수
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        String N =br.readLine();
        int []num = new int[10];
        for(int i=0;i<N.length();i++){
            int n = Integer.parseInt(N.substring(i, i+1));
            num[n]++;
            sum += n;
        }
        if(N.contains("0") && sum%3==0){
            for(int i=9;i>=0;i--){
                while(num[i] > 0){
                    System.out.print(i);
                    num[i]--;
                }
            }
            System.out.println();
        }else   System.out.println(-1);
    }
}
