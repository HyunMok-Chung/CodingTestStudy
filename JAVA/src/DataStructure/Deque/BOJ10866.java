package DataStructure.Deque;

import java.io.*;
import java.util.*;

public class BOJ10866 {  // 덱 (덱 자료구조 활용 문제)
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        ArrayDeque<Integer> dp = new ArrayDeque<>();
        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            String[] s = br.readLine().split(" ");
            // split 함수로 입력받은 문장을 배열로 만듦
            if(s[0].equals("push_front")){
                // 덱의 앞에 원소 삽입
                dp.addFirst(Integer.parseInt(s[1]));
            }else if(s[0].equals("push_back")){
                // 덱의 뒤에 원소 삽입
                dp.addLast(Integer.parseInt(s[1]));
            }else if(s[0].equals("pop_front")){
                if(dp.isEmpty()){
                    sb.append(-1).append("\n");
                }else{
                    // 덱 앞 원소 반환 및 삭제
                    sb.append(dp.pollFirst()).append("\n");
                }
            }else if(s[0].equals("pop_back")){
                if(dp.isEmpty()){
                    sb.append(-1).append("\n");
                }else{
                    // 덱 뒤 원소 반환 및 삭제
                    sb.append(dp.pollLast()).append("\n");
                }
            }else if(s[0].equals("size")){
                // 덱의 크기 반환
                sb.append(dp.size()).append("\n");
            }else if(s[0].equals("empty")){
                if(dp.isEmpty())
                    sb.append(1).append("\n");
                else
                    sb.append(0).append("\n");
            }else if(s[0].equals("front")){
                if(dp.isEmpty()){
                    sb.append(-1).append("\n");
                }else{
                    // 덱 앞 원소 반환 (삭제는 하지 않음)
                    sb.append(dp.peekFirst()).append("\n");
                }
            }else{
                if(dp.isEmpty()){
                    sb.append(-1).append("\n");
                }else{
                    // 덱 뒤 원소 반환 (삭제는 하지 않음)
                    sb.append(dp.peekLast()).append("\n");
                }
            }
        }
        System.out.print(sb);
    }
}
