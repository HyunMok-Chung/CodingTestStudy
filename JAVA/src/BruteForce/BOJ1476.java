package BruteForce;

import java.util.*;
import java.io.*;

public class BOJ1476 {  // 날짜 계산
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int e = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int i=1;
        int E=1;
        int S=1;
        int M=1;
        while(true){
            if(E>15)
                E=1;
            if(S>28)
                S=1;
            if(M>19)
                M=1;
            if(E==e && S==s & M==m)
                break;
            i++;
            E++;
            S++;
            M++;
        }
        System.out.println(i);
    }
}
