import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ9095 { // 1,2,3 더하기(DP)
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            int n = Integer.parseInt(br.readLine());
            int []num = new int[10];
            num[0] = 1;
            num[1] = 2;
            num[2] = 4;
            for(int j=3;j<10;j++)
                num[j] = num[j-1]+num[j-2]+num[j-3];
            System.out.println(num[n-1]);
        }
        
    }
}