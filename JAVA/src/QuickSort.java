import java.util.*;

public class QuickSort {
    // 퀵솔트는 재귀함수 이용함. -> 시간복잡도가 다른 정렬방식에 비해 매우 짧음.
    public static void main(String args[]){
        Integer array[] = new Integer[] {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};

        Arrays.sort(array); // 오름차순 정렬
    
        for(int i : array)
            System.out.print(i+" ");
        System.out.println();

        Arrays.sort(array, Collections.reverseOrder());  // 내림차순 정렬 -> 쓰려면 기본타입 배열을 Wrapper클래스로 만들어 적용시켜야한다.
        for(int i:array)
            System.out.print(i + " ");
        System.out.println();
    }
}
