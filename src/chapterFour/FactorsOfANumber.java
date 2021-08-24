package chapterFour;

import java.util.Scanner;

public class FactorsOfANumber {

    public static void main(String[] args) {

        int number = 0;

        int counter = 1;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");


        number = input.nextInt();

        System.out.printf("The factors of %d are:", number);


        while (counter <= number ){

            if ( number % counter == 0){

               System.out.print("  " + counter);

            }

            counter++;
        }

    }
}
