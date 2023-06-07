package DataStructure.QueueCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();
        Queue<Integer> q = new LinkedList<Integer>();
        int num = 0;

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String sVal = st.nextToken();
            
            if(sVal.equals("push")) {
                num = Integer.parseInt(st.nextToken());
                q.offer(num);
            } else if(sVal.equals("pop")) {
                if(q.isEmpty())
                    sb.append(-1).append("\n");
				else
                    sb.append(q.poll()).append("\n");
            } else if(sVal.equals("size")) {
                sb.append(q.size()).append("\n");
            } else if(sVal.equals("empty")) {
                if(q.isEmpty())
                    sb.append(1).append("\n");
				else
                    sb.append(0).append("\n");
            } else if(sVal.equals("front")) {
                if(q.isEmpty())
                    sb.append(-1).append("\n");
				else
                    sb.append(q.peek()).append("\n");
            } else {
                if(q.isEmpty())
                    sb.append(-1).append("\n");
				else
                    sb.append(num).append("\n");
            }
        }
        System.out.println(sb);
    }
}
