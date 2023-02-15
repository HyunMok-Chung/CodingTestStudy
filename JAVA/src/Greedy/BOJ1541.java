package Greedy;

import java.io.*;

public class BOJ1541 {  // 잃어버린 괄호
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] cal1 = br.readLine().split("-"); // 빼기를 기준으로 분리
		int res = 0;
		for(int i=0;i<cal1.length;i++) {
			int sum = 0;
			String[] cal2 = cal1[i].split("\\+");
			for(int j=0;j<cal2.length;j++) {
				sum += Integer.parseInt(cal2[j]);
			}
			if(i==0) {
				res += sum;
			}else {
				res -= sum;
			}
		}
		System.out.println(res);
    }
}
