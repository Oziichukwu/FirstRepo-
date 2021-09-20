package chapterSix;

import java.util.Scanner;

public class DisplayASqureOfAsterisk {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of sides");
        int sides = input.nextInt();
        displaySquareOfAsterisk(sides);
    }

    private static void displaySquareOfAsterisk(int sides){

        for (int i = 1; i <= sides; i++) {
            for (int j = 1; j <= sides; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
