import java.io.*;

public class BOJ10953 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++){
            String[] s = br.readLine().split(",");
            sb.append(Integer.parseInt(s[0])+Integer.parseInt(s[1])).append("\n");
        }
        System.out.print(sb);
    }
}
