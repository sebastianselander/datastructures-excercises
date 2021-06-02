package exam_2020_08_20;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int[] arr = {4,3,6,2,1};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSort(int[] A){
        for (int i = 1; i < A.length; i++){
            int x = A[i];
            int j = i - 1;
            while (A[j] > x){
                A[j+1] = A[j];
                j--;
                if (j < 0) break;
            }
            System.out.println("Before swap: " + Arrays.toString(A));
            A[j+1] = x;
            System.out.println("After swap: " + Arrays.toString(A));
        }
    }
}
