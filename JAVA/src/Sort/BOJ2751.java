package Sort;

import java.util.*;
import java.io.*;

public class BOJ2751 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        ArrayList<Integer> list = new ArrayList<>();

        int n = Integer.parseInt(br.readLine());

        for(int i=0;i<n;i++){
            list.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(list);
        //Collections.sort = TimSort = 합병 및 삽입정렬 알고리즘, List 계열 자료구조를 사욯해야함.
        //-> 시간복잡도 O(N) ~ O(N*logN)
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            sb.append(list.get(i)).append("\n");
        }
        System.out.println(sb);
    }
}
