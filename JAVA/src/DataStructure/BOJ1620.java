package DataStructure;

import java.io.*;
import java.util.*;

public class BOJ1620 {  // 나는야 포켓몬 마스터 이다솜 (해시맵 활용)
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        HashMap<String, String> hm = new HashMap<>();
        for(int i=1;i<=n;i++){
            String name = br.readLine();
            // 키와 값을 모두 String 값으로 삽입해줌.
            hm.put(Integer.toString(i), name);
            hm.put(name, Integer.toString(i));
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<m;i++){
            String a = br.readLine();
            // 입력받는 형에 상관없이 String으로 값을 반환할 수 있음.
            sb.append(hm.get(a)).append("\n");
        }
        System.out.print(sb);
    }
}
