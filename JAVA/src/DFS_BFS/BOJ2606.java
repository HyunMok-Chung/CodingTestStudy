package DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2606 {  // 바이러스 DFS & BFS 문제
    public static int[][] com;
    public static boolean[] check;
    public static int node;
    public static int cnt = 0;

    public static void dfs(int start){
        check[start] = true;
        cnt++;

        for(int i=0;i <= node;i++){
            if(com[start][i] == 1 && !check[i]){
                dfs(i);
            }
        }
    }
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        node = Integer.parseInt(br.readLine());
        int line = Integer.parseInt(br.readLine());

        com = new int[node + 1][node + 1];
        check = new boolean[node + 1];

        for(int i=0;i<line;i++){
            st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            com[x][y] = com[y][x] = 1;
        }

        dfs(1);

        System.out.println(cnt - 1);
    }
}
