public class GCD {
    // 유클리드 호제법과 재귀함수를 사용한 최대공약수 구하기
    public static int gcd(int a, int b){
        if(a%b == 0)
            return b;
        else
            return gcd(b, a%b);
    }
    public static void main(String[] args){
        System.out.println(gcd(192, 162));
    }
}
