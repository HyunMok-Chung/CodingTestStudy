import java.util.*;

public class Until1 {  // 동빈나 알고리즘 영상1 그리디 문제 1
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int cnt = 0;

        while(true){
            int target = (n/k)*k;
            cnt += (n-target);
            n = target;
            if(n<k)
                break;
            n /= k;
            cnt++;
        }
        cnt += (n-1);
        System.out.println(cnt);
        sc.close();
    }
}
