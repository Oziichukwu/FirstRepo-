package chapterSeven;

import java.util.Scanner;

public class ArrayExercises {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int total = 0;
        int maximum =  1; //Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;
        int [] number = new int[5];
        int i = 0;
        for ( i = 0; i < 5; i++) {
            System.out.println("Enter number: " + (i+1));
          number[i] = input.nextInt();
            total = total + number[i];
            if (number[i] > maximum){
                maximum = number[i];
            }
            if(number[i] < minimum){
                minimum = number[i];
            }
        }
          int  average = total / 5;

        System.out.println("The total is: " + total);
        System.out.println("The average is: " + average);
        System.out.println("The maximum is: " + maximum);
        System.out.println("The minimum is: " + minimum);
    }
}
