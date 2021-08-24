package chapterFiveExercises;

import java.util.Scanner;

public class FivePointEleven {
private static int count =0;
    public static void main(String... args) {
            if (count > 2){

                System.out.println("The maximum input of values is 10");
            }
        int numberCounter = 1;

        int number = 0;

        int counter = 1;

        int smallest = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of values");


        int firstNumber = input.nextInt();

        if ( firstNumber > 10) {
            count++;
            main();
        }

                System.out.printf("Kindly input your %d numbers %n", firstNumber);


                while (counter <= firstNumber) {

                    System.out.println("Enter number" + numberCounter++);

                    number = input.nextInt();

                    if (counter == 1) {

                        smallest = number;

                    }

                    if (number < smallest) {

                        smallest = number;

                    }

                    counter++;
                }

        System.out.printf("The smallest number is: %d", smallest);

                System.exit(smallest);
    }
}
