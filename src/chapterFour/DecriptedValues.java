package chapterFour;

import java.util.Scanner;

public class DecriptedValues {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a four digit number");
        int number = input.nextInt();

        int digit1 = number / 1000;
        if (digit1 < 7){
            digit1  += 10;
        }
        int criptOne = (digit1 - 7) % 10;

        int digit2 = (number / 100) % 10;
        if (digit2 < 7){
            digit2 += 10;
        }
        int criptTwo = (digit2 - 7) % 10;

        int digit3 = (number % 100) / 10;
        if (digit3 < 7){
            digit3 +=10;
        }
        int criptThree = (digit3 - 7) % 10;

        int digit4 = number % 10;
        if (digit4 < 7){
            digit4 +=10;
        }
        int criptFour = (digit4 - 7) % 10;

        System.out.printf("%d%d%d%d", criptOne, criptTwo, criptThree, criptFour);
    }
}
