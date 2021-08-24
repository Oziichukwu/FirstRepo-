package chapterTwoExercises;

import java.util.Scanner;

public class TwoPointTwentyFour {

    public static void main(String[] args) {

    int numberCounter = 1;

    int largest = 0;

    int smallest = 0;

    int counter = 1;

   Scanner input = new Scanner(System.in);

    while ( counter <= 5) {

        System.out.println("Enter number" + numberCounter++);

        int number = input.nextInt();

        if (counter == 1) {

            largest = number;
        }

        if (number > largest) {

            largest = number;
        }

        if (counter == 1) {

            smallest = number;

        }

        if (number < smallest) {

            smallest = number;

        }

        counter++;

    }

        System.out.printf("Smallest number is: %d%n", smallest);

        System.out.printf("Largest number is: %d", largest);

    }
}
