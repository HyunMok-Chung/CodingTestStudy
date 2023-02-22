package DataStructure.StackCode;

import java.util.*;
import java.io.*;

public class BOJ9012 {  // 괄호 (스택)
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++){
            Stack<Character> stack = new Stack<>();
            String s = br.readLine();
            for(int j=0;j<s.length();j++){
                char c = s.charAt(j);
                if(c == '(')
                    stack.push(c);
                else if(stack.empty()){
                    // 스택이 비어있는 경우. 즉, 닫는 괄호를 입력받았으나 pop할 원소가 없는 경우.
                    // 조건을 만족하지 않는 경우임.
                    stack.push(c);
                    break;
                }
                else{
                    stack.pop();
                }
            }
            if(stack.empty())
                sb.append("YES").append("\n");
            else
                sb.append("NO").append("\n");
        }
        System.out.print(sb);
    }
}
