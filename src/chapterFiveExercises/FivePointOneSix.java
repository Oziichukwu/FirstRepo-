package chapterFiveExercises;

import java.util.Scanner;

public class FivePointOneSix {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String collector = "Bar Chart\n";
        int numberOfInputs = 5;
        int number;
        System.out.println("Enter 5 numbers between 1-30");

        for (int Bar = 1; Bar <= numberOfInputs; Bar++) {

            System.out.println("Enter number" + Bar);
            number = input.nextInt();
            if (number >=1 && number <= 30) {
                int userInput = number;
                collector += "Bar " + Bar + ":";

                for (int asterisk = 1; asterisk <= userInput; asterisk++) {
                    collector += "*";
                }
                collector += "\n";
            }
            else{
                System.out.println("Enter a valid number between 1 and 30");
                number = input.nextInt();
            }
        }
        System.out.printf("%s", collector);
    }
}