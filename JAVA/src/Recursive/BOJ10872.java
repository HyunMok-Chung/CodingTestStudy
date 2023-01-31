package Recursive;

import java.io.*;

public class BOJ10872 {
    static int mul(int a){
        if(a<=1)
            return a;
        else
            return a*mul(a-1);
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(mul(n));
    }
}
