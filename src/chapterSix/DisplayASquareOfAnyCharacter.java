package chapterSix;

import java.util.Scanner;

public class DisplayASquareOfAnyCharacter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the sides of the square");
        int sides = input.nextInt();
        System.out.println("Enter the character you would like to be displayed");
        char fill = input.next().charAt(0);
        displaySquareOfAnyCharacter(sides,fill);
    }

    private static void displaySquareOfAnyCharacter(int sides, char fill){

        for (int i = 1; i <= sides ; i++) {
            for (int j = 0; j <= sides; j++) {
                System.out.print(" " + fill);
            }
            System.out.println();
        }

    }
}
