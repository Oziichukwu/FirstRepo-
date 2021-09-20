package chapterSix;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EvenOrOddNumberSelection {
    public static void main(String... args) {
        Scanner input = new Scanner(System.in);
        try {
        System.out.println("Enter a number to determine if it is even or odd");
        int number = input.nextInt();
        System.out.println(toDetermineWhetherAnIntegerIsEvenOrOdd(number));
        }
        catch (InputMismatchException ex){
            System.out.printf("Exception: %s%n", "invalid input");
            main();
        }
    }

    private static boolean toDetermineWhetherAnIntegerIsEvenOrOdd(int number){

        if (number % 2 == 0) {
            System.out.println("Number is even");
            return true;
        }
            System.out.println("Number is not even");
            return false;
    }
}
