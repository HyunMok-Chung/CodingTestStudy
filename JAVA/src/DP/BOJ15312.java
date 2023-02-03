package DP;

import java.util.*;
import java.io.*;

public class BOJ15312 {  // 이름 궁합
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] alpha = new int[]{3,2,1,2,3,3,2,3,3,2,2,1,2,2,1,2,2,2,1,2,1,1,1,2,2,1};
        String name1 = br.readLine();
        String name2 = br.readLine();
        ArrayList<Integer> dp = new ArrayList<>();
        for(int i=0;i<name1.length();i++){
            dp.add(alpha[name1.charAt(i)-'A']);
            dp.add(alpha[name2.charAt(i)-'A']);
        }
        StringBuilder sb = new StringBuilder();
        while(dp.size()>2){
            ArrayList<Integer> temp  = new ArrayList<>();
            for(int i=0;i<dp.size()-1;i++){
                temp.add((dp.get(i)+dp.get(i+1))%10);
            }
            dp = temp;
        }
        sb.append(dp.get(0)).append(dp.get(1));
        System.out.println(sb);
    }
}
