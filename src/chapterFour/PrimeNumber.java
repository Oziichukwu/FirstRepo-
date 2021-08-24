package chapterFour;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        int number = 0;

        int counter = 2;

        boolean sentinel = false;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");

        number = input.nextInt();

        while (counter <= number / 2) {

            if ( number % counter == 0){

                sentinel = true;

                break;
            }
                counter++;
        }

        if (sentinel == false)
            System.out.printf("%d is a prime number", number);

        else

            System.out.printf("%d is not a prime number", number);

    }
}