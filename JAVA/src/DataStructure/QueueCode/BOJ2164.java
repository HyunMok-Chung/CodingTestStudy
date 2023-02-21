package DataStructure.QueueCode;

import java.util.*;
import java.io.*;

public class BOJ2164 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> card = new LinkedList<>(); // int형 큐 선언
        for(int i=1;i<=n;i++){
            card.offer(i);
        }
        while(card.size()>1){
            card.poll();
            card.offer(card.poll());
        }
        System.out.println(card.poll());
    }
}
