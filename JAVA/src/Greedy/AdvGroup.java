package Greedy;
import java.util.*;

public class AdvGroup { // 동빈나 알고리즘 영상 2 그리디 문제 3
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> adv = new ArrayList<>();
        for(int i=0;i<n;i++){
            adv.add(sc.nextInt());
        }
        Collections.sort(adv);
        int group = 0;  // 총 그룹의 수
        int cnt = 0;  // 현재 그룹에 포함된 모험가의 수
        for(int i=0;i<n;i++){
            cnt++;  // 현재 그룹에 해당 모험가 포함시키기
            if(cnt>=adv.get(i)){  // 현재 그룹에 포함된 모험가의 수가 현재의 공포도 이상이라면 그룹 생성
                group++;  // 총 그룹의 수 증가시키기
                cnt = 0;  // 현재 그룹에 포함된 모험가의 수 초기화
            }
        }
        System.out.println(group);
        sc.close();
    }
}
