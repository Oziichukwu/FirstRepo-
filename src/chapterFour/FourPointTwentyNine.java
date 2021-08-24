package chapterFour;

import java.util.Scanner;

public class FourPointTwentyNine {

    public static void main(String[] args) {

        int sidesOfTheSquare;


        Scanner input = new Scanner(System.in);

        System.out.println("Enter the sides of the square");

      sidesOfTheSquare = input.nextInt();

        for( int i = 1; i <= sidesOfTheSquare; i++){

            for(int j = 1; j <= sidesOfTheSquare; j++) {

                if (i == 1)
                    System.out.print("*");
                else if (j == 1)
                    System.out.print("*");
                else if (i == sidesOfTheSquare)
                    System.out.print("*");
                else if(j == sidesOfTheSquare)
                    System.out.print("*");
                else
                System.out.print(" ");
            }
                System.out.println();
            }
        }
    }

