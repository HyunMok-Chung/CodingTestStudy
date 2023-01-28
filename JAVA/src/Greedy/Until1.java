package Greedy;
import java.util.*;
import java.io.*;

public class Until1 {  // 동빈나 알고리즘 영상 2 그리디 문제 1
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int cnt = 0;

        while(n>=k){
            cnt++;
            if(n%k != 0)
                n -= 1;
            else
                n /= k;
        }
        System.out.println(cnt);
    }
}
