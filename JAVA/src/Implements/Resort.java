package Implements;
import java.util.*;
public class Resort { // 동빈나 알고리즘 영상 2 문자열 문제 1
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        List<Character> list = new ArrayList<Character>();
        int num = 0;
        for(int i=0;i<str.length();i++){
            if(Character.isLetter(str.charAt(i))){
                list.add(str.charAt(i));
            }else
                num+=(str.charAt(i)-'0');
        }
        Collections.sort(list);
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));
        }
        if(num != 0) System.out.print(num);
        System.out.println();
        sc.close();
    }
}
