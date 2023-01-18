import java.io.*;
import java.util.*;

public class IOtest {
    //made for IO Code Test
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        st = new StringTokenizer(br.readLine());
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=0;i<8;i++){
            arr.add(i, Integer.parseInt(st.nextToken()));
        }
        // StringBuilder sb = new StringBuilder();
        // for(int i=0;i<arr.size();i++){
        //     sb.append(arr.get(i) + " ");
        // }
        // System.out.println(sb);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<arr.size();i++){
            sb.append(arr.get(i) + " ");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.newLine();
        bw.close();
    }
}
