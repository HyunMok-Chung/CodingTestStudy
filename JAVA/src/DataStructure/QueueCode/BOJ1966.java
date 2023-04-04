package DataStructure.QueueCode;

import java.io.*;
import java.util.*;

public class BOJ1966 {  // BOJ1966 프린트 큐
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for(int i=0;i<t;i++){
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            LinkedList<int[]> q = new LinkedList<>();
            st = new StringTokenizer(br.readLine());

            for(int j=0;j<n;j++){// 처음 위치와 중요도 입력
                q.offer(new int[]{j, Integer.parseInt(st.nextToken())});
            }

            int cnt = 0; // 출력 순서 카운트

            while(!q.isEmpty()){
                int[] val = q.poll(); // 제일 처음 프린트물
                int check = 1; // 첫번째 프린트물이 가장 큰 중요도인지 체크하는 변수. 1일때가 제일 높은 경우로 설정.

                for(int j=0;j<q.size();j++){ // 큐에 남아있는 프린트와 중요도 비교
                    // 처음 뽑은 프린트보다 큐 안에 위치한 프린트의 중요도가 높을 경우
                    if(val[1] < q.get(j)[1]){
                        q.offer(val);
                        // 뽑은 프린트물과 j이전의 프린트물을 뒤로 보냄.
                        for(int k=0;k<j;k++){
                            q.offer(q.poll());
                        }
                        check = 0;  // 우선순위가 높은 원소가 아니었기 때문에 0으로 지정
                        break;
                    }
                }
                if(check == 0)  // 가장 큰 원소가 아니었어서 다음 반복문으로 넘겨줌
                    continue;
                // 다음 반복문으로 안넘어감 = 첫 프린트가 가장 큰 원소였다는 뜻
                cnt++; // 가장 큰 원소였으르로 출력 횟수 증가
                if(val[0] == m) // 찾고자 했던 문서라면 종료
                    break;
            }
            sb.append(cnt).append("\n");
        }
        System.out.print(sb);
    }
}
