package Implements;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ9093 { // 단어 뒤집기 (구현, 문자열)
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuffer str = new StringBuffer();

        for(int i=0;i<t;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()){
                StringBuffer sb = new StringBuffer(st.nextToken());
                str.append(sb.reverse()+ " ");
            }
            str.append("\n");
        }
        System.out.print(str);
    }
}