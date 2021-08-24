
package chapterSeven;

import java.util.Scanner;

import static chapterSeven.Arrays.*;

public class NewArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of scores");

        int numberOfScores = input.nextInt();

        int[] figures = new int[numberOfScores];

        for (int i = 0; i < figures.length; i++) {

            System.out.println("Enter Number" + (i + 1));

            figures[i] = input.nextInt();
        }
            int minimum = calculateminimunFrom(figures);
            int largest = calculateTotal(figures) - minimum;
            int  maximum = calculateMaximumFrom(figures);
            int lowest = calculateTotal(figures) - maximum;
            System.out.println("The maximum is: " + largest);
            System.out.println("The minimum is: " + lowest);
        }

}