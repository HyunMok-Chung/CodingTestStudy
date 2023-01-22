package Sort;

import java.util.*;
import java.io.*;

public class BOJ1427 {  // 소트인사이드
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();
        ArrayList<Integer> num = new ArrayList<>();
        while(n!=0){
            int m = n%10;
            num.add(m);
            n /= 10;
        }
        Collections.sort(num);
        StringBuilder sb = new StringBuilder();
        for(int i=num.size()-1;i>=0;i--)
            sb.append(num.get(i));
        System.out.println(sb);
    }
}
