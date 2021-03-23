package reverse_array;

import java.util.Arrays;
import java.util.Objects;

public class reverse_array {

    public static void main(String[] args) {

        int[] ogArray = {1,2,3,4,5,6,7,8,9,10};
        int[] revArray = reverseArray(ogArray);
        System.out.println(Arrays.toString(ogArray));
        System.out.println(Arrays.toString(revArray));

    }

    public static int[] reverseArray(int[] array){
        int index = 0;
        int[] newArray = new int[array.length];
        for (int i = array.length - 1; i >= 0; i--){
            newArray[index] = array[i];
            index++;
        }
    return newArray;
    }
}
