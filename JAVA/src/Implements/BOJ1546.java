package Implements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1546 {  // 평균 수학, 사칙연산 단순 구현 문제
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int n = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());

        int max = 0;
        double sum = 0;

        for(int i=0;i<n;i++){
            int val = Integer.parseInt(st.nextToken());
            max = Math.max(max, val);
            sum += val;
        }

        System.out.println(((sum / max) * 100.0) / n);
    }
}
