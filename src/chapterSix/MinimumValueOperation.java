package chapterSix;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MinimumValueOperation {
    public static void main(String... args) {
        double firstNumber = collectInput("Enter first Number");
        double secondNumber = collectInputTwo("Enter second Number");
        double thirdNumber = collectInputThree("Enter third number");
        System.out.printf("The minimum is %.2f", calculateMinimumValue(firstNumber, secondNumber, thirdNumber));
    }

    private static double collectInput(String prompt) {

        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Enter first Number");
            return input.nextDouble();
        }catch (InputMismatchException ep) {
            System.out.printf("Exception: %s%n", "invalid input, kindly reenter a valid input");
            return collectInput(prompt);
        }
    }
    private static double collectInputTwo(String promptTwo){
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Enter second Number");
            return input.nextDouble();
        }
        catch (InputMismatchException ex){
            System.out.printf("Exception: %s%n", "invalid input, kindly reenter a valid input");
            return collectInputTwo(promptTwo);
        }
    }
    private static double collectInputThree(String promptThree){
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Enter third Number");
            return input.nextDouble();
        }
        catch (InputMismatchException ex){
            System.out.printf("Exception: %s%n", "invalid input, kindly reenter a valid input");
            return collectInputThree(promptThree);
        }

    }
    private static double calculateMinimumValue(double firstNumber, double secondNumber,
                                             double thirdNumber){
        return Math.min(firstNumber, Math.min(secondNumber,thirdNumber));

    }
}
