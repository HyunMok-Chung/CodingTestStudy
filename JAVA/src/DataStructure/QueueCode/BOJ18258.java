package DataStructure.QueueCode;

import java.io.*;
import java.util.*;

public class BOJ18258 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Integer> q = new LinkedList<>();
        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            String[] s = br.readLine().split(" ");
            if(s[0].equals("push")){
                q.offer(Integer.parseInt(s[1]));
            }else if(s[0].equals("pop")){
                if(q.isEmpty()){
                    sb.append("-1").append("\n");
                }else{
                    sb.append(q.poll()).append("\n");
                }
            }else if(s[0].equals("size")){
                sb.append(q.size()).append("\n");
            }else if(s[0].equals("empty")){
                if(q.isEmpty()){
                    sb.append("1").append("\n");
                }else{
                    sb.append("0").append("\n");
                }
            }else if(s[0].equals("front")){
                if(q.isEmpty()){
                    sb.append("-1").append("\n");
                }else{
                    sb.append(q.peekFirst()).append("\n");
                }
            }else{
                if(q.isEmpty()){
                    sb.append("-1").append("\n");
                }else{
                    sb.append(q.peekLast()).append("\n");
                }
            }
        }
        System.out.print(sb);
    }
}
