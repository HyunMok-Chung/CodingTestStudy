package DP;

import java.util.*;
import java.io.*;

public class BOJ17202 {  // 핸드폰 번호 궁합
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> num = new ArrayList<>();
        String num1 = br.readLine();
        String num2 = br.readLine();
        for(int i=0;i<8;i++){
            num.add(num1.charAt(i)-'0');
            num.add(num2.charAt(i)-'0');
        }
        while(num.size()>2){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int i=0;i<num.size()-1;i++)
                temp.add((num.get(i)+num.get(i+1))%10);
            num = temp;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(num.get(0)).append(num.get(1)).append("\n");
        System.out.print(sb);
    }
}
