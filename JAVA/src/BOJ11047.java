import java.util.*;
import java.io.*;

public class BOJ11047 { //동전 0 (그리디)
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum = 0;
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int []coin = new int[n];
        for(int i=0;i<n;i++)
            coin[i] = Integer.parseInt(br.readLine());
        for(int i=n-1;i>=0;i--){
            if(coin[i]<=k){
                sum += k/coin[i];
                k %= coin[i];
            }
        }
        System.out.println(sum);
    }
}
