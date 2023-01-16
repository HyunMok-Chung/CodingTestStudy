import java.util.*;

public class AdvGroup { // 동빈나 알고리즘 영상1 그리디 문제 3
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> adv = new ArrayList<>();
        for(int i=0;i<n;i++){
            adv.add(sc.nextInt());
        }
        adv.sort(Comparator.naturalOrder());
        int group = 0;
        int cnt = 0;
        for(int i=0;i<n;i++){
            cnt++;
            if(cnt==adv.get(i)){
                group++;
                cnt = 0;
            }
        }
        System.out.println(group);
        sc.close();
    }
}
