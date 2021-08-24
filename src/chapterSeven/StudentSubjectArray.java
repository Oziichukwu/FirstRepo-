package chapterSeven;

import java.util.Scanner;

class StudentsSubjectArray {
        private static Scanner input = new Scanner(System.in);
        private static int numberOfStudents;
        private static int numberOfSubjects;
        private static int[][]scores;
        public static void main(String[] args) {


//
//        System.out.println("Enter number of students");
//        int numberOfStudents = input.nextInt();
//        System.out.println("Enter number of subjects");
//        int numberOfSubjects = input.nextInt();
            //int[][]scores = new int[numberOfStudents][numberOfSubjects];
            setUp();
//score collection
            collectScore();
            //loop thru the students
//        for(int student = 0; student < numberOfStudents; student++){
//            System.out.println("Entering student 1 score" + (student+1));
//        //loop thru subjects
//            for(int subject = 0; subject < numberOfSubjects; subject++){
//                System.out.println("Enter subject score " + (subject+1));
//                scores [student][subject]  = input.nextInt();
//                System.out.println("Scores for Student " + (student+1) + ", subject" + (subject+1) + "Saved successfully");
//        }
//        System.out.println("Scores for Student " + (student+1) + " Saved successfully");
//     }
//score display
            displayScore();
//        for(int student = 0; student < numberOfStudents; student++) {
//            System.out.println("Student " + (student+1) + "Scores");
//            for (int subject = 0; subject < numberOfSubjects; subject++) {
//                System.out.println("Score for subject" + (subject+1) +" : " +scores[student][subject]);
//            }
//            System.out.println("____________________________________");
//            System.out.println();
//        }
//        System.out.println("Thanks for your Patience");
//    }
        }
        private static void collectScore() {
            //loop thru the students
            for(int student = 0; student < numberOfStudents; student++){
                System.out.println("Entering student 1 score" + (student+1));
                //loop thru subjects
                for(int subject = 0; subject < numberOfSubjects; subject++){
                    System.out.println("Enter subject score " + (subject+1));
                    scores [student][subject]  = input.nextInt();
                    System.out.println("Scores for Student " + (student+1) + ", subject" + (subject+1) + "Saved successfully");
                }
                System.out.println("Scores for Student " + (student+1) + " Saved successfully");
            }
        }

        private static void setUp( ) {
            System.out.println("Enter number of students");
            int numberOfStudents = input.nextInt();
            System.out.println("Enter number of subjects");
            int numberOfSubjects = input.nextInt();
            scores = new int[numberOfStudents][numberOfSubjects];
        }


        private static void displayScore() {
            for(int student = 0; student < numberOfStudents; student++) {
                System.out.println("Student " + (student+1) + "Scores");
                for (int subject = 0; subject < numberOfSubjects; subject++) {
                    System.out.println("Score for subject" + (subject+1) +" : " +scores[student][subject]);
                }
                System.out.println("____________________________________");
                System.out.println();
            }
            System.out.println("Thanks for your Patience");
        }
    }


