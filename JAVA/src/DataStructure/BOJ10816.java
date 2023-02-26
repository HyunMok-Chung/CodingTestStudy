package DataStructure;

import java.util.*;
import java.io.*;

public class BOJ10816 {  // 숫자 카드 2 (HashMap 풀이)
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = null;
        HashMap<Integer, Integer> card = new HashMap<>();
        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            int key = Integer.parseInt(st.nextToken());
            card.put(key, card.getOrDefault(key, 0)+1);
            // getOrDefault 메소드를 사용해 입력된 숫자의 횟수 카운팅
        }
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<m;i++){
            int key = Integer.parseInt(st.nextToken());
            sb.append(card.getOrDefault(key, 0)).append(" ");
        }
        System.out.println(sb);
    }
}
