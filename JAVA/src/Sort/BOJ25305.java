package Sort;

import java.util.*;
import java.io.*;

public class BOJ25305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        ArrayList<Integer> score = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            score.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(score);
        StringBuilder sb = new StringBuilder();
        sb.append(score.get(n-k));
        System.out.println(sb);
    }
}
