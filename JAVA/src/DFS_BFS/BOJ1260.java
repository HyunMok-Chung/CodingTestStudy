package DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ1260 {  // DFS & BFS 정석문제
    public static int node, line, start;
	public static int[][] arr;
	public static boolean[] checkDfs;
    public static boolean[] checkBfs;
	public static Queue<Integer> q = new LinkedList<>();
    public static StringBuilder sb = new StringBuilder();
    
    public static void dfs (int start) {
        checkDfs[start] = true;
        sb.append(start + " ");
        for(int i=0;i<=node;i++){
            if(arr[start][i] == 1 && !checkDfs[i]){
                dfs(i);
            }
        }
    }
    public static void bfs (int start) {
        q.offer(start);
        checkBfs[start] = true;

        while(!q.isEmpty()) {
            int startNode = q.poll();
            sb.append(startNode + " ");
            for (int i = 0; i <= node; i++) {
                if(arr[startNode][i] == 1 && !checkBfs[i]){
                    q.offer(i);
                    checkBfs[i] = true;
                }
            }
        }
    }
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        node = Integer.parseInt(st.nextToken());
        line = Integer.parseInt(st.nextToken());
        start = Integer.parseInt(st.nextToken());

        arr = new int[node + 1][node + 1];

        for(int i=0;i<line;i++) {
            st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            arr[x][y] = arr[y][x] = 1;
        }

        checkDfs = new boolean[node + 1];
        dfs(start);
        sb.append("\n");


        checkBfs = new boolean[node + 1];
        bfs(start);

        System.out.println(sb);
    }
}
