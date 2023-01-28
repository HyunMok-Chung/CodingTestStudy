package Greedy;
import java.util.*;

public class MulorAdd { // 동빈나 알고리즘 영상 2 그리디 문제 2
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int result = str.charAt(0) - '0';
        for(int i=1;i<str.length();i++){
            int num = str.charAt(i)-'0';
            if(result<=1 || num<=1)
                result += num;
            else
                result *= num;
        }
        System.out.println(result);
        sc.close();
    }
}
