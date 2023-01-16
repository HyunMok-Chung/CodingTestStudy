import java.util.*;
public class time { // 동빈나 알고리즘 영상1 완전탐색 문제 1
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int cnt = 0;
        for(int i=0;i<=h;i++){
            for(int j=0;j<60;j++){
                for(int k=0;k<60;k++){
                    if(i%10==3 || j%10==3 || j/10==3 || k%10==3 || k/10==3)
                        cnt++;
                }
            }
        }
        System.out.println(cnt);
        sc.close();
    }
}
