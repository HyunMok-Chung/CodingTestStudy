package Sort;

import java.io.*;
import java.util.*;

public class BOJ1072 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        long x = Integer.parseInt(st.nextToken());
        long y = Integer.parseInt(st.nextToken());
        long z = y*100/x;
        if(z>=99){
            sb.append(-1).append("\n");
        }else{
            long start = 0;
            long end = x;
            while(start <= end){
                long mid = (start + end) / 2;
                if(z < 100*(y+mid)/(x+mid)){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
            sb.append(start).append("\n");
        }
        System.out.print(sb);
    }
}