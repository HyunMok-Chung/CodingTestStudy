package DataStructure.QueueCode;

import java.util.*;
import java.io.*;

public class BOJ11866 {  // 요세푸스의 문제 (큐 활용)
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        Queue<Integer> q = new LinkedList<>();
        for(int i=1;i<=n;i++){
            q.offer(i);
        }
        while(q.size()>1){
            // 마지막 출력 부분은 공백이 없기 때문에 마지막 원소 전까지만 반복
            for(int i=0;i<k-1;i++){
                q.offer(q.poll());
            }
            sb.append(q.poll()).append(", ");
        }
        sb.append(q.poll()).append(">\n");
        System.out.print(sb);
    }
}
