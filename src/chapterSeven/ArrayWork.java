package chapterSeven;

import com.sun.jdi.Value;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayWork<scores> {

    private static Scanner input = new Scanner(System.in);
    private static int numberOfStudents = 0;
    private static int numberOfSubjects = 0;
    private static int[][] scores;
    private static Collections ArraysUtils;


    public static void main(String[] args) {

        collateStudentsScores();
        displayScoresOfStudents();
        calculateTotalScore();
        calculateAverageScore();
        getHighestAndLowestScoringStudent();
        getHighestAndLowestScoringStudentForEachSubject();
        getRankingForEachStudent();
    }

    private static void collectInput() {

        System.out.println("Enter the number of Students");
        numberOfStudents = input.nextInt();
        System.out.println("Enter the number of subjects");
        numberOfSubjects = input.nextInt();
        scores = new int[numberOfStudents][numberOfSubjects];
    }

    private static void collateStudentsScores() {
        collectInput();
        for (int student = 0; student < numberOfStudents; student++) {

            System.out.println("Enter Student " + (student + 1) + " Scores");
            System.out.println();
            for (int subject = 0; subject < numberOfSubjects; subject++) {

                System.out.println("Enter Subject score " + (subject + 1));

                scores[student][subject] = input.nextInt();
            }
            System.out.println("scores for student " + (student + 1));
        }
    }

    private static void displayScoresOfStudents() {
        int totalScore[] = new int[numberOfStudents];
        System.out.print("          ");
        for (int subject = 0; subject < numberOfSubjects; subject++)
            System.out.print("Subject " + (subject + 1) + " ");
        System.out.print("\tTotal");
        System.out.print("\tAverage Score");
        System.out.print("\t Ranking");
        System.out.println("\n" + "-".repeat(120));
        for (int student = 0; student < numberOfStudents; student++) {
            totalScore[student] = 0;
            double averageScore = 0;

            System.out.print("Student " + (student + 1) + "|" + "  ");
            for (int subject = 0; subject < numberOfSubjects; subject++) {
                System.out.printf("%6d   ", scores[student][subject]);
                totalScore[student] += scores[student][subject];
                averageScore = (double) totalScore[student] / numberOfSubjects;
            }
            int j = 0;
            int max = totalScore[0];
            for (j = 0; j < totalScore.length; j++) {

                max = Math.max(max, totalScore[j]);
                for (int i = 1; i <= totalScore.length; i++)
                    max = i;


            }
            System.out.printf("%7d", totalScore[student]);
            System.out.printf("%16.2f", averageScore);
            System.out.print("   " + (j + 1));
            System.out.println();


                System.out.println();

        }
    }
    private static void calculateTotalScore() {
        System.out.println("=".repeat(40));

        for (int student = 0; student < numberOfStudents; student++) {
            int totalScore = 0;
            for (int subject = 0; subject < numberOfSubjects; subject++) {
                totalScore += scores[student][subject];
            }
            System.out.printf("%s%d%s%d%n", "The total for student ", (student + 1), " is:", totalScore);
        }
        System.out.println("=".repeat(40));
        System.out.println();
    }
    private static void calculateAverageScore() {
        System.out.println("=".repeat(40));
        for (int student = 0; student < numberOfStudents; student++) {
            double averageScore = 0;
            int totalScore = 0;
            for (int subject = 0; subject < numberOfSubjects; subject++) {
                totalScore += scores[student][subject];
                averageScore = totalScore / numberOfSubjects;
            }

            System.out.printf("%s%d%s%.2f%n", "The average for student ", (student + 1), " is:", averageScore);
        }
        System.out.println("=".repeat(40));
        System.out.println();
    }

    private static void getHighestAndLowestScoringStudent() {
        System.out.print("=".repeat(40));
        int maximumForRow = Integer.MIN_VALUE;
        int minimumForRow = Integer.MAX_VALUE;
        int indexForRow = 0;
        int indexForColumn = 0;
        for (int student = 0; student < scores.length; student++) {
            int totalScore = 0;

            for (int subject = 0; subject < scores[student].length; subject++) {

                totalScore += scores[student][subject];
            }
                if (totalScore > maximumForRow) {
                    maximumForRow = totalScore;
                    indexForRow = student;
                }
                if (totalScore < minimumForRow) {

                    minimumForRow = totalScore;
                    indexForColumn = student;
                }
        }
        System.out.println();
        System.out.println("Student " + (indexForRow + 1) + " has the overall highest of  " + maximumForRow);
        System.out.println("Student " + (indexForColumn + 1) + " has the overall lowest of  " + minimumForRow);
        System.out.print("=".repeat(40));
        System.out.println();
        System.out.println();
    }

    private static void getHighestAndLowestScoringStudentForEachSubject() {
        int maximumScoreForEachSubject;
        int index1 = 0;
        int index2 = 0;
        System.out.println("=".repeat(50));
        for (int student = 0; student < numberOfSubjects; student++) {
            maximumScoreForEachSubject = scores[0][student];
            for (int subject = 0; subject < scores.length; subject++) {

                maximumScoreForEachSubject = Math.max(maximumScoreForEachSubject,scores[subject][student]);

                    index2 = student;
                }
            index1 = student;
            System.out.println("Student " + (index1 + 1) + " has the highest of " + maximumScoreForEachSubject  + " in subject " + (index2 + 1));
        }
        System.out.print("=".repeat(50));
        System.out.println();
    }

    private static void getRankingForEachStudent(){
       // System.out.println("=".repeat(40));
            int [] totalScore = new int[numberOfStudents];
        for (int student = 0; student < numberOfStudents; student++) {
             totalScore[student] = 0;
            for (int subject = 0; subject < numberOfSubjects; subject++) {
                totalScore[student] += scores[student][subject];
            }
           // System.out.printf("%s%d%s%d%n", "The total for student ", (student + 1), " is:", totalScore);
        }
       // System.out.println(Arrays.toString(totalScore));

      //  int num = 0;
        int max = totalScore[0];
            for (int j = 0; j < totalScore.length;j++ ) {

                max = Math.max(max, totalScore[j]);
                for (int i = 1; i <= totalScore.length; i++) {
                          max = i;
                }
                System.out.println("student" + (j+1));
            }

            //max = i;
            // System.out.println("=".repeat(40));
            // System.out.println();
       // System.out.println(" student" + (num+ 1));

        }

}
