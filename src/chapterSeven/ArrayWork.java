package chapterSeven;

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

        System.out.print("          ");
        for (int subject = 0; subject < numberOfSubjects; subject++)
            System.out.print("Subject " + (subject + 1) + " ");
        System.out.print("\tTotal");
        System.out.print("\tAverage Score");
        System.out.print("\t Ranking");
        System.out.println("\n" + "-".repeat(120));
        for (int student = 0; student < numberOfStudents; student++) {
            int totalScore = 0;
            double averageScore = 0;

            System.out.print("Student " + (student + 1) + "|" + "  ");
            for (int subject = 0; subject < numberOfSubjects; subject++) {
                System.out.printf("%6d   ", scores[student][subject]);
                totalScore += scores[student][subject];
                averageScore = (double) totalScore / numberOfSubjects;
            }
            System.out.printf("%7d", totalScore);
            System.out.printf("%16.2f", averageScore);

            System.out.println();
        }
        System.out.println();
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
        int maximumForRow = 0;
        int minimumForRow = 0;
        int indexForrow = 0;
        int indexForColum = 0;
        for (int i = 0; i < scores[0].length; i++) {
            maximumForRow += scores[0][i];
            minimumForRow += scores[0][i];
        }
        for (int student = 0; student < scores.length; student++) {
            int totalScore = 0;

            for (int subject = 0; subject < scores[student].length; subject++) {

                totalScore += scores[student][subject];

                if (maximumForRow < totalScore) {

                    maximumForRow = totalScore;
                    indexForrow = student;
                }
                if (minimumForRow > totalScore) {

                    minimumForRow = totalScore;
                    indexForColum = student;
                }
            }
        }
        System.out.println();
        System.out.println("Student " + (indexForrow + 1) + " has the overall highest of  " + maximumForRow);
        System.out.println("Student " + (indexForColum + 1) + " has the overall lowest of  " + minimumForRow);
        System.out.print("=".repeat(40));
        System.out.println();
        System.out.println();
    }

    private static void getHighestAndLowestScoringStudentForEachSubject() {
        int maximumForColumn = 0;
        int index1 = 0;
        int index2 = 0;
        System.out.println("=".repeat(50));
        for (int student = 0; student < numberOfSubjects; student++) {
            maximumForColumn = scores[0][student];
            for (int subject = 0; subject < scores.length; subject++) {

                maximumForColumn = Math.max(maximumForColumn,scores[subject][student]);
                    index1 = subject;
                    index2 = student;
                }
            System.out.println("Student " + (index1 + 1) + " has the highest of " + maximumForColumn  + " in subject " + (index2 + 1));

        }
        System.out.print("=".repeat(50));
        System.out.println();
    }
}
