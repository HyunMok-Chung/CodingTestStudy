import java.util.*;

public class SelectSort {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int array[] = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
        int i, j, temp;
        for(i=0;i<array.length-1;i++){
            for(j=i+1;j<array.length;j++){
                if(array[i]>array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for(int k : array)
            System.out.print(k + " ");
        sc.close();
    }
}
