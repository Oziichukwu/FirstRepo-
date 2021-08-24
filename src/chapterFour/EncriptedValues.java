package chapterFour;

import java.util.Scanner;

public class EncriptedValues {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a four digit number");

        int number = input.nextInt();

        int digit1 = number / 1000;
        int cript1 = (digit1 + 7) % 10;

        int digit2 = (number / 100) % 10;
        int cript2 = (digit2 + 7) % 10;

        int digit3 = (number % 100) / 10;
        int cript3 = (digit3 + 7) % 10;

        int digit4 = number % 10;
        int cript4 = (digit4 + 7) % 10;

        System.out.printf("%d%d%d%d", cript1, cript2, cript3, cript4);
    }
}
