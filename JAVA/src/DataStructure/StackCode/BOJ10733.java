package DataStructure.StackCode;

import java.util.*;
import java.io.*;

public class BOJ10733 {  // 제로 (스택 풀이)
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> s = new Stack<>();
        int k = Integer.parseInt(br.readLine());
        for(int i=0;i<k;i++){
            int n = Integer.parseInt(br.readLine());
            if(n==0){
                s.pop();
            }else{
                s.push(n);
            }
        }
        int sum = 0;
        for(int i:s){
            sum += i;
        }
        System.out.println(sum);
    }
}
