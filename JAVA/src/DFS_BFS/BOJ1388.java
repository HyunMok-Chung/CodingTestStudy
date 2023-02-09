package DFS_BFS;

import java.util.*;
import java.io.*;

public class BOJ1388 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        char[][] floor = new char[n][m];
        for(int i=0;i<n;i++){
            String s = br.readLine();
            for(int j=0;j<m;j++){
                floor[i][j] = s.charAt(j);
            }
        }
        int cnt = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(j!=0 && floor[i][j]=='-' && floor[i][j-1]=='-'){
                    continue;
                }else if(i!=0 && floor[i][j]=='|' && floor[i-1][j]=='|'){
                    continue;
                }
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
