package chapterFour;

import java.util.Scanner;

public class FourPointThirtySix {

    public static void main(String[] args) {

        int counter = 1;

        int number;
        int side1 = 0;
        int side2 = 0;
        int side3 = 0;
        Scanner input = new Scanner(System.in);

        while( counter <= 3){

            System.out.println("Enter triangle side: " + counter);

                number = input.nextInt();

                if (counter == 1){

                      side1 = (int)Math.pow(number,2);
                }

                if (counter == 2){

                     side2 = (int)Math.pow(number,2);
                }

                if (counter == 3){

                     side3 = (int)Math.pow(number,2);
                }
                counter++;
        }

        int sum = side1 + side2;

        if (sum == side3){

            System.out.println("Numbers are the sides of a Right Angle Triangle");
        }
        else
            System.out.println("Numbers are not the sides of a Right Angle Triangle");

    }

}
