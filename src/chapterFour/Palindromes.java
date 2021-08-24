package chapterFour;

import java.util.Scanner;

public class Palindromes {

    public static void main(String... args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a five digit number");
        int number = input.nextInt();

        if (number / 10000 == 0){

            System.out.println("Number is not a five digit number. \nKindly enter a five digit number");
            main();
        }

        int digit1 = number / 10000;
        int number1 = number % 10000;

        int digit2 = number1 / 1000;
        int number2 = number1 % 1000;

        int digit3 = number2 / 100;
        int number3 = number2 % 100;

        int digit4 = number3 / 10;
        int number4 = number3 % 10;

        if (number4 == digit1){

            System.out.println("Number is palindrome");
        }
        else
        {
            System.out.println("Number is not a palindrome");
        }
    }
}
