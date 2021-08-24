package chapterFiveExercises;

import java.util.Scanner;

public class FivePointThirteen {

    public static void main(String[] args) {

        int counter = 1;

        long number = 1;

        System.out.printf("%8s %25s%n", "Number", "Factorial");


        while ( counter <= 20){


                number = counter * number;

                System.out.printf("%4d %23d%n", counter , number);

               counter++;
        }

    }
}
