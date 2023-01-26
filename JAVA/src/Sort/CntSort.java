package Sort;

public class CntSort {  // 계수 정렬 연습
    public static void main(String[] args){
        int[] cnt = new int[5]; // 범위가 5 이하인 조건 가정
		int[] array =new int[]{ // 30개 데이터
			1, 3, 2, 4, 3, 2, 5, 3, 1, 2,
			3, 4, 4, 3, 5, 1, 2, 3, 5, 2,
			3, 1, 4, 3, 5, 1, 2, 1, 1, 1
		};
        for(int i=0;i<5;i++){
            cnt[i] = 0;
        }
        for(int i=0;i<30;i++){
            cnt[array[i]-1]++;
        }
        for(int i=0;i<5;i++){
            if(cnt[i] != 0){
                for(int j=0;j<cnt[i];j++)
                    System.out.print(i+1 + " ");
            }
        }
        System.out.println();
    }
}
