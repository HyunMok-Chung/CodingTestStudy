package Greedy;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Comparator;

public class BOJ1931 { // 회의실 배정 (그리디)
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int cnt = 0;
        int end = 0;
        int N = Integer.parseInt(br.readLine());
        int [][]time = new int[N][2];
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            time[i][0] = Integer.parseInt(st.nextToken());
            time[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(time, new Comparator<int[]>() {
            public int compare(int[] o1, int[] o2){
                if(o1[1] == o2[1])
                    return o1[0] - o2[0];
                return o1[1] - o2[1];
            }
        });
        for(int i=0;i<N;i++){
            if(end<=time[i][0]){
                end = time[i][1];
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
