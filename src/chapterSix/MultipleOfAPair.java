package chapterSix;

import java.util.Scanner;

public class MultipleOfAPair {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first Number");
        int firstNumber = input.nextInt();
        System.out.println("Enter second Number");
        int secondNumber = input.nextInt();
        System.out.println(multipleOfTwoNumbers(firstNumber,secondNumber));

    }

    private static boolean multipleOfTwoNumbers(int firstNumber, int secondNumber){
        if (firstNumber % secondNumber == 0 ) {
        System.out.printf("%d is a multiple of %d", secondNumber, firstNumber);
            System.out.println();
        return true;
    }
    else {
        System.out.printf("%d is a not multiple of %d", secondNumber, firstNumber );
            System.out.println();
        return false;
    }
    }
}