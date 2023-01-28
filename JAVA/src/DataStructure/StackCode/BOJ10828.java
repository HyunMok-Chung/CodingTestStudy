package DataStructure.StackCode;

import java.util.*;
import java.io.*;

public class BOJ10828 {  // 스택
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            String order = st.nextToken();
            if(order.equals("push")){
                int num = Integer.parseInt(st.nextToken());
                s.push(num);
            }else if(order.equals("pop")){
                if(s.empty())
                    sb.append(-1).append("\n");
                else{
                    sb.append(s.peek()).append("\n");
                    s.pop();
                }
            }else if(order.equals("size")){
                sb.append(s.size()).append("\n");
            }else if(order.equals("empty")){
                if(s.empty())
                    sb.append(1).append("\n");
                else
                    sb.append(0).append("\n");
            }else{
                if(s.empty())
                    sb.append(-1).append("\n");
                else{
                    sb.append(s.peek()).append("\n");
                }
            }
        }
        System.out.print(sb);
        s.clear();
    }
}
