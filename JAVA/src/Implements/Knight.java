package Implements;
import java.util.*;
public class Knight { // 동빈나 알고리즘 영상 구현 문제 1
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] dx = new int[]{-2, -2, -1, -1, 1, 1, 2, 2};
        int[] dy = new int[]{-1, 1, -2, 2, -2, 2, -1, 1};

        int row = s.charAt(1)-'0';
        int col = s.charAt(0)-'a'+1;
        int result = 0;
        for(int i=0;i<8;i++){
            int nx = col + dx[i];
            int ny = row + dy[i];
            if(nx>=1 && nx<=8 && ny>=1 && ny<=8)
                result++;
        }
        System.out.println(result);

        sc.close();
    }
}
