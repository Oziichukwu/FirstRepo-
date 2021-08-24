package chapterFour;

import java.util.Scanner;

public class FourPointTwentyOne {

    public static void main(String[] args) {
       /*

        while counter is less than or equal to 10
        prompt the user for a number
        if the number is greater than the largest number
        The number is stored as the new largest
        print out the largest
        */
        Scanner input = new Scanner(System.in);
        int counter = 1;

        int number;

        int largest = 0;

        while( counter <= 10){

            System.out.println("Enter number: " + counter);

            number  = input.nextInt();

            if ( number > largest){

                largest = number;
            }
                counter++;
        }
        System.out.println("The largest is " + largest);
    }
}
