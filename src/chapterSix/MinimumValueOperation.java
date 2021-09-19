package chapterSix;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MinimumValueOperation {
    public static void main(String... args) {
        Scanner input = new Scanner(System.in);
        try{
        System.out.println("Enter first Number");
        double firstNumber = input.nextDouble();
        System.out.println("Enter second Number");
        double secondNumber = input.nextDouble();
        System.out.println("Enter third Number");
        double thirdNumber = input.nextDouble();
        System.out.printf("%s%.2f","The minimum value is ", calculateMinimumValue(firstNumber,secondNumber,thirdNumber));
        }
        catch (InputMismatchException ep){
            System.out.printf("Exception: %s%n", "invalid input");
            main();
        }
    }

    private static double calculateMinimumValue(double firstNumber, double secondNumber,
                                             double thirdNumber){
        return Math.min(firstNumber, Math.min(secondNumber,thirdNumber));

    }
}
