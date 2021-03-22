package guess_a_number;

import java.util.Random;
import java.util.Scanner;

public class Main {
    private static Random rand = new Random();
    private static Scanner sc = new Scanner(System.in);
    private static final int choice = sc.nextInt();
    private static int computerGuess;
    private static int right = 10000;
    private static int left = 0;

    public static void main(String[] args) {
        while (computerGuess != choice){
            System.out.println("Higher or lower? Reply with \"Higher\" or \"Lower\"");
            String bound = sc.next();
            if (bound.equals("Higher")){
                binarySearch();
            } else if (bound.equals("Lower")){
                binarySearch();
            } else {
                System.out.println("Please only reply with \"Higher\" or \"Lower\"");
                bound = sc.next();
            }
        }
    }
    public static int binarySearch(){
        return 0;
    }
}
