package chapterFour;

import java.util.Scanner;

public class Comparison {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

            System.out.println("Enter number");
            int number1 = input.nextInt();
            int number2 = input.nextInt();
            int number3 = input.nextInt();

        System.out.println("comparison is :" + (number1 < number2 && number2 < number3) );

    }
}
