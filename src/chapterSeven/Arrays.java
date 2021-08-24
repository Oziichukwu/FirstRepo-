package chapterSeven;

import java.util.Scanner;

public class Arrays {

    public static int calculateMaximumFrom(int[] scores){

        int maximumNumber = scores[0];

        for (int i = 0; i < scores.length; i++){

            maximumNumber = Math.max(maximumNumber,scores[i]);
//            if (scores[i] > maximumNumber){
//
//                maximumNumber = scores[i];
//            }
        }
        return  maximumNumber;
    }

    public static int calculateminimunFrom(int[] scores){

        int minimumNumber = scores[0];

        for (int i = 0; i < scores.length; i++) {

            minimumNumber = Math.min(minimumNumber,scores[i]);
//
//            if (scores[i] < minimumNumber){
//
//                minimumNumber = scores[i];
//            }
        }
        return minimumNumber;
    }

    public static int calculateTotal(int[] scores){

        int total = 0;

        for (int i = 0; i < scores.length; i++) {

             total += scores[i];

        }
                 return total;
    }

    public static double calculateAverageFrom(int[] scores){

        calculateTotal(scores);

        double average = calculateTotal(scores) / (scores.length * 1.0);

                  return average;
    }

    public static void main(String[] args) {

        System.out.println("Kindly enter the number of grades");
        Scanner input = new Scanner(System.in);
        int numberOfGrades = input.nextInt();

        int[] grades = new int[numberOfGrades];

        for (int i = 0; i < grades.length; i++) {

            System.out.println("Enter number: " + (i + 1));

            grades[i] = input.nextInt();
        }

        System.out.println("The total is: " + calculateTotal(grades));
        System.out.println("The maximum is: " + calculateMaximumFrom(grades));
        System.out.println("The minimum is: " + calculateminimunFrom(grades));
        System.out.println("The average is: " + calculateAverageFrom(grades));

        for (int grade: grades){

            System.out.print(" "+ grade);
        }
    }
}


