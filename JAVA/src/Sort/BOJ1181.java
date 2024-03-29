package Sort;

import java.util.*;
import java.io.*;

public class BOJ1181 {  // 단어 정렬 
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] word = new String[n];
        for(int i=0;i<n;i++)
            word[i] = br.readLine();
        Arrays.sort(word, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2){
                if(o1.length() == o2.length()){
                    return o1.compareTo(o2);
                } else {
                    return o1.length()-o2.length();
                }
            }
        });
        StringBuilder sb = new StringBuilder();
        sb.append(word[0]).append("\n");
        for(int i=1;i<n;i++){
            if(word[i].equals(word[i-1]))
                continue;
            sb.append(word[i]).append("\n");
        }
        System.out.print(sb);
    }
}
