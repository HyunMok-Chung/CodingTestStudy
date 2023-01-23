package Sort;

import java.util.*;
import java.io.*;

public class BOJ11279 {  // 최대 힙 PriorityQueue 풀이
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<=n;i++){
            int x = Integer.parseInt(br.readLine());
            if(x == 0){
                if(!heap.isEmpty()){
                    sb.append(heap.poll()).append("\n");
                }else
                    sb.append(0).append("\n");
            }else{
                heap.add(x);
            }
        }
        System.out.print(sb);
    }
}
