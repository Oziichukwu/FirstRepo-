package chapterFour;

import java.util.Scanner;

public class FourPointTwentyThree {

    public static void main(String[] args) {

        int numberCounter = 1;

        int counter = 1;

        int number;

        int firstLargest = 0;

        int secondLargest = 0;


        Scanner input = new Scanner(System.in);

        while (counter <= 5) {

       System.out.println("Enter Number" + numberCounter++);

        number = input.nextInt();


        if (number > firstLargest) {

            secondLargest = firstLargest;

            firstLargest = number;
        }

       else

            if (number > secondLargest)

                secondLargest = number;

        counter++;
        }

        System.out.printf("First Largest is: %d%n", firstLargest);

        System.out.printf("Second Largest is: %d", secondLargest);
    }
}
