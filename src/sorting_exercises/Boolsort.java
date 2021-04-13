package sorting_exercises;

import java.util.Arrays;

public class Boolsort {


    public static boolean[] booleanSort(boolean[] array){
        boolean[] result = new boolean[array.length];
        int trueCounter = 0;
        int falseCounter = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i]){
                trueCounter++;
            }
            if (!array[i]){
                falseCounter++;
            }
        }
        for (int i = 0; i < falseCounter + trueCounter; i++){
            if (i < falseCounter) result[i] = false;
            else result[i] = true;
        }
        return result;
    }

    public static void main(String[] args) {
        boolean[] test = new boolean[]{true,true,true,false,false,false,true,true};
        System.out.println(Arrays.toString(booleanSort(test)));
    }
}
