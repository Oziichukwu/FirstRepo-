package chapterEleven;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) {

        int firstNumber = input("Enter first Number");
        int secondNumber = input("Enter second Number");
        try {
            System.out.printf("The answer is %d ", firstNumber / secondNumber);
        } catch (ArithmeticException ep) {
            if (firstNumber == 0) {
                System.out.println("first number cannot be zero");
                System.out.println("Kindly enter a valid input");
            } else if (secondNumber == 0) {
                System.out.println("second number cannot be zero");
                System.out.println("Kindly enter a valid input");
            }
        }
    }

    private static int input(String prompt) {
        Scanner input = new Scanner(System.in);
        System.out.println(prompt);
        try {
            return input.nextInt();
        }
        catch (InputMismatchException ex) {

            System.out.println("kindly renter a valid input");
            return input(prompt);
        }

    }

    private static void thisMethodMightCatchException(){
        try{
        throwException();}
        catch (Exception ex){

            System.out.println("this method handles the exception that was thrown initially");
        }
    }

    private static int throwException() throws Exception{

        System.out.println();
        throw new Exception("enter what you want to throw here");
    }
}
