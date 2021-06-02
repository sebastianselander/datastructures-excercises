package exam_2020_10_09;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] firstPart = {};
        oneItQuickSort(firstPart);
        System.out.println("First finished: " + Arrays.toString(firstPart));

        int[] secondPart1 = {};
        oneItQuickSort(secondPart1);
        System.out.println("Second1 finished: " + Arrays.toString(secondPart1));

        int[] secondPart2 = {};
        oneItQuickSort(secondPart2);
        System.out.println("Second2 finished: " + Arrays.toString(secondPart2));
    }

    public static void oneItQuickSort(int[] array){
        int pivotIndex = 0;
        int pivot = array[pivotIndex];
        int leftPointer = 0;
        int rightPointer = array.length - 1;
        swap(pivotIndex,array.length - 1, array);
        while (true){
            while(leftPointer < array.length - 1 && array[leftPointer] <= pivot) leftPointer++;
            while(rightPointer >= 0 && array[rightPointer] >= pivot) rightPointer--;
            if (rightPointer < leftPointer) break;
            swap (leftPointer, rightPointer, array);
        }
        swap(leftPointer, array.length - 1, array);
        System.out.println("First part: " + Arrays.toString(Arrays.copyOfRange(array, 0, leftPointer)));
        System.out.println("Second part: " + Arrays.toString(Arrays.copyOfRange(array, leftPointer, array.length)));
    }

    public static int[] swap(int index1, int index2, int[] array){
        int first = array[index1];
        int second = array[index2];
        array[index1] = second;
        array[index2] = first;
        return array;
    }
}
