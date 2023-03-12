package DataStructure.QueueCode;

import java.io.*;
import java.util.*;

public class BOJ1158 { // 요세푸스 문제 (큐 활용)
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        Queue<Integer> q = new LinkedList<>();
        for(int i=1;i<=n;i++){
            q.offer(i);
        }
        sb.append("<");
        while(q.size()>1){
            for(int i=0;i<k-1;i++){
                q.offer(q.poll());
            }
            sb.append(q.poll()).append(", ");
        }
        sb.append(q.poll()).append(">\n");
        System.out.print(sb);
    }
}
