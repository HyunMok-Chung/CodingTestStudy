package Implements;

import java.util.*;
import java.io.*;

public class BOJ1764 {  // 듣보잡 -> HashSet 사용 문제
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        HashSet<String> name = new HashSet<>();
        for(int i=0;i<n;i++){
            name.add(br.readLine());
        }
        StringBuilder sb = new StringBuilder();
        int cnt = 0;
        ArrayList<String> result = new ArrayList<>();
        for(int i=0;i<m;i++){
            String s = br.readLine();
            if(name.contains(s)){
                cnt++;
                result.add(s);
            }
        }
        Collections.sort(result);
        sb.append(cnt).append("\n");
        for(int i=0;i<result.size();i++){
            sb.append(result.get(i)).append("\n");
        }
        System.out.print(sb);
    }
}