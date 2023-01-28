package DFS_BFS;

import java.util.*;
import java.io.*;

public class FreezingDrinks {  // 나동빈 DFS&BFS 영상 음료수 얼려먹기 문제
    // DFS 활용 예제
    public static int n, m;
    public static int[][] drink = new int[1001][1001];
    public static boolean dfs(int a, int b){
        // 주어진 범위를 벗어나면 종료
        if(a<=-1 || a>=n || b<=-1 || b>=m)
            return false;
        if(drink[a][b] == 0){
            drink[a][b] = 1; // 방문 처리
            // 상하좌우 위치도 재귀적으로 처리
            dfs(a-1, b);
            dfs(a, b-1);
            dfs(a+1, b);
            dfs(a, b+1);
            return true;
        }
        return false;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        br.close();

        for(int i=0;i<n;i++){
            String num = br.readLine();
            for(int j=0;j<m;j++){
                drink[i][j] = num.charAt(j)-'0';
            }
        }
        int result = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(dfs(i, j))
                    result++;
            }
        }
        System.out.println(result);
    }
}
