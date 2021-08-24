package chapterSeven;

import java.util.Scanner;

public class ArrayAssignment {

    public static int calculateTotal(int[] scores){

        int total = 0;

        for (int i = 0; i < scores.length; i++) {

            total += scores[i];
        }

        return total;
    }
    // Aray list explanation
  //  ArrayList<Interger> scores = newArraylist<>();
       // scores.add(4);
    public static int[] getTheNextSetOfArray(int[] scores){

         int total =   calculateTotal(scores);
        int [] newArray = new int [scores.length];
            int newValues;

        for (int i = 0; i < scores.length;) {
            for(int score: scores){

            newValues = total - score;

             newArray[i]  = newValues;
                i++;
            }
        }
        return newArray;

    }

    public static int calculateMaximumNumberFrom(int[] scores){
      int [] newArray = getTheNextSetOfArray(scores);

        int maximumNumber = newArray[0];
        for (int i = 0; i < scores.length; i++) {

            maximumNumber = Math.max(maximumNumber,newArray[i]);
        }
        return maximumNumber;
    }

    public static int calculateMinimumNumberFrom(int[] scores){

        int [] newArray = getTheNextSetOfArray(scores);

            int minimumNumber = newArray[0];

        for (int i = 0; i < scores.length; i++) {

            minimumNumber = Math.min(minimumNumber,newArray[i]);

        }
        return minimumNumber;
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of scores");

        int NumberOfScores = input.nextInt();
            int [] scores = new int[NumberOfScores];

        for (int i = 0; i < scores.length; i++) {

            System.out.println("Enter Number" + (i+1));
            scores[i] = input.nextInt();
        }
        System.out.println("The Total is: " + calculateTotal(scores));
        System.out.println("The maximum is: " + calculateMaximumNumberFrom(scores));
        System.out.println("The minimum is: " + calculateMinimumNumberFrom(scores));
       // System.out.println("The new Array set is: " + );

//        System.out.println();
//        for ( int sum: getTheNextSetOfArray(scores)) {
//            System.out.print("  " + sum);
//        }

            }
        }