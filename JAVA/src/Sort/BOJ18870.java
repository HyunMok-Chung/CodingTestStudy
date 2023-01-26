package Sort;

import java.util.*;
import java.io.*;

public class BOJ18870 {  // 좌표 압축
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        int n = Integer.parseInt(br.readLine());
        int[] num = new int[n];
        int[] sort = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++)
            num[i] = sort[i] =  Integer.parseInt(st.nextToken());
        Arrays.sort(sort);
        HashMap<Integer, Integer> sorted = new HashMap<>();
        int cnt = 0;
        for(int i=0;i<n;i++){
            if(!sorted.containsKey(sort[i])){
                sorted.put(sort[i], cnt);
                cnt++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            sb.append(sorted.get(num[i])).append(" ");
        }
        System.out.println(sb);
    }
}
