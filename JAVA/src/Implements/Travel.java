package Implements;
import java.util.*;
public class Travel { // 동빈나 알고리즘 영상 구현 문제 1
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char[] move = new char[]{'L', 'R', 'U', 'D'};
        int[] dx = new int[]{0, 0, -1, 1};
        int[] dy = new int[]{-1, 1, 0, 0};
        int n = sc.nextInt();
        sc.nextLine();  // next() 이후나 사이에 nextLine()을 쓰려면 nextLine()을 한 번 더 써줘야함.->개행문자 제거용
        String t = sc.nextLine();
        t = t.replaceAll(" ", "");

        int X = 1; int Y = 1;
        for(int i=0;i<t.length();i++){
            int nx = 0; int ny = 0;
            for(int j=0;j<4;j++){
                if(t.charAt(i) == move[j]){
                    nx = X + dx[j];
                    ny = Y + dy[j];
                }
            }
            if(nx<1 || ny<1 || nx>n || ny>n)
                continue;
            X = nx;
            Y = ny;
        }
        System.out.println(X + " " + Y);
        sc.close();
    }
}
