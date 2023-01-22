package Sort;

import java.io.*;
import java.util.*;

public class BOJ10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        int n = Integer.parseInt(br.readLine());
        String[][] join = new String[n][2];

        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            join[i][0] = st.nextToken();
            join[i][1] = st.nextToken();
        }
        Arrays.sort(join, new Comparator<String []>() {  // Comparator 함수에 대해 공부하기.
            @Override
            public int compare(String[] o1, String[] o2) {
                if(o1[0] == o2[0])
                    return 1;
                else{
                    return Integer.parseInt(o1[0])-Integer.parseInt(o2[0]);
                }
            }
        });
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++)
            sb.append(join[i][0]).append(" ").append(join[i][1]).append("\n");
        System.out.print(sb);
    }
}
