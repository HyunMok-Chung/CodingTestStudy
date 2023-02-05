package BruteForce;

public class BOJ4673 {  // 셀프 넘버
    public static void main(String[] args){
        int[] check = new int[10001];
        for(int i=1;i<=10000;i++){
            int num = i;
            int sum = i;
            while(num != 0){
                sum += num%10;
                num /= 10;
            }
            if(sum<=10000)
                check[sum] = 1;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<=10000;i++){
            if(check[i]!=1)
                sb.append(i).append("\n");
        }
        System.out.print(sb);
    }
}
