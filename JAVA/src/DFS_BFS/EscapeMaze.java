package DFS_BFS;

import java.util.*;
import java.io.*;

public class EscapeMaze {  // 나동빈 DFS&BFS 영상 미로탈출 문제
    // BFS 활용 예제 (최단 거리)
    public static int n, m;
    public static int[][] maze = new int[201][201];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        for(int i=0;i<n;i++){
            String num = br.readLine();
            for(int j=0;j<m;j++){
                maze[i][j] = num.charAt(j)-'0';
            }
        }

    }
}
