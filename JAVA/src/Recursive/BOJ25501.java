package Recursive;

import java.io.*;

public class BOJ25501 {  // 재귀의 귀재
    static int result;
    public static int recursion(String s, int l, int r){
        result++;
        if(l>=r)
            return 1;
        else if(s.charAt(l) != s.charAt(r))
            return 0;
        else
            return recursion(s, l+1, r-1);
    }
    public static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            String s = br.readLine();
            result=0;
            sb.append(isPalindrome(s)).append(" ").append(result);
            System.out.println(sb);
            sb.setLength(0);
        }
    }
}
