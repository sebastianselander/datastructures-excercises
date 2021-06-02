package sorting_exercises;

import java.util.Arrays;

public class removeDups {

    public static int[] removeDuplicates(int[] array){
        Arrays.sort(array);
        int element = array[0];
        int[] newArr = new int[array.length];
        newArr[0] = element;
        int counter = 1;
        for (int i = 1; i < array.length; i++){
            if (array[i] != element){
                element = array[i];
                newArr[counter] = element;
                counter++;
            }
        }
        return Arrays.copyOf(newArr, counter);
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,1,1,1,1,2,2,2,2,3,3,3,3,3,4,5,4,4,4,4};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(removeDuplicates(arr)));
    }
}
