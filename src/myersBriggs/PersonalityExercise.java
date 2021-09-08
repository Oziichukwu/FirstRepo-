package myersBriggs;

import java.util.Arrays;
import java.util.Scanner;

public class PersonalityExercise {
    public static void main(String[] args) {
        displayHeaderOfThePersonalityExercise();
        collateAnswersFromTheUser();
        displayTabulatedUsersResponsesOne();git
        collateTheSumOfAllCounts();
    }

    public static String[] questions;
    public static char[] userAnswer;

    private static void displayHeaderOfThePersonalityExercise() {

        System.out.println("""
        Welcome to Myers Briggs Personality Exercise
        Kindly choose from the list of questions below specific answers that best describe you
        Remember to be completely honest as this is a reflection of your personality""");
    }

    private static String[] displayFirstSetOfPersonalityQuestions() {

        String[] questions = {"""
                                    Questions 1:
                                    a.expand energy, enjoy groups 
                                    b.conserve energy, enjoy one-one
                                """,
                                """
                                    Question 2:
                                    a. interpret literally
                                    b. look for meaning and possibilities,
                                """,
                                """
                                    Question 3:
                                    a. logical,thinking,questioning
                                    b. empathetic, feeling, accomodating
                                """,
                                """
                                    Question 4:
                                    a. organized, orderly
                                    b. flexible, adaptable
                                """,
                                """
                              Question 5:
                              a. more outgoing, think out loud
                              b. more reserved, think to yourself
                           
                              """,
                                """
                                 Question 6:
                                 a. practical, realistic, experiential
                                 b. imaginative, innovative, theoretical
                                 """,
                                """
                                Question 7:
                                a. candid, straight forward, frank
                                b. tactful, kind, encouraging
                                """,
                                """
                                Question 8:
                                a. plan, schedule
                                b. unplanned, sponteneous
                                """,
                                """
                                    Question 9:
                                    a. seek many tasks public activities, interaction with others
                                    b. seek private, solitary activities with quiet to concentrate
                                """,
                                """
                                    Question 10:
                                    a. standard, usual, conventional
                                    b. different, novel, unique
                                """,
                                """
                                    Question 11:
                                    a. firm, tend to criticize, hold the line
                                    b. gentle, tend to appreciate, conciliate
                                """,
                                """
                                    Question 12:
                                    a. regulated, structured
                                    b. easygoing, "live" and "let live"
                                """,
                                """
                                    Question 13:
                                    a. external, communicative, express yourself
                                    b. internal, reticent, keep to yourself
                                """,
                                """
                                    Question 14:
                                    a. focus on here and now
                                    b. look to the future, global perspective, "big picture"
                                """,
                                """
                                    Question 15:
                                    a. tough-minded, just
                                    b. tender-hearted, merciful
                                """,
                                """
                                    Question 16:
                                    a. preparation, plan ahead
                                    b. go with the flow, adapt as you go
                                """,
                                """
                                    Question 17:
                                    a. active, initiate
                                    b. reflective, deliberate
                                """,
                                """
                                    Question 18:
                                    a. facts, things "what is"
                                    b. ideas, dreams, "what could be," philosophical
                                """,
                                """
                                    Question 19:
                                    a. matter of fact, issue-oriented
                                    b. sensitive, people-oriented, compassionate
                                """,
                                """
                                    Question 20:
                                    a. control, govern
                                    b. latitude, freedom
                                """

        };
        return questions;
    }

    private static void collateAnswersFromTheUser() {
        questions = displayFirstSetOfPersonalityQuestions();
        Scanner input = new Scanner(System.in);
        userAnswer = new char[questions.length];
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.println("Kindly choose the appropriate option: ");
            char collectAnswers = input.next().charAt(0);
                userAnswer[i] = collectAnswers;
        }
    }

    private static void displayTabulatedUsersResponses() {
        String display = String.format("%6s%6s%6s", " ", "A", "B");
        System.out.printf(display.repeat(4));
        System.out.println();
        System.out.println("=".repeat(80));
    }

    private static void displayTabulatedUsersResponsesOne() {
        displayTabulatedUsersResponses();
        for (int i = 1; i < questions.length; i += 4) {
            System.out.printf("%6d", i);
            if (userAnswer[i - 1] == 'A' || userAnswer[i - 1] == 'a') {
                System.out.printf("%6s%6s", "A", " ");
            } else {
                System.out.printf("%6s%6s", " ", "B");
            }
            System.out.printf("%6d", i + 1);
            if (userAnswer[i] == 'A' || userAnswer[i] == 'a') {
                System.out.printf("%6s%6s", "A", " ");
            } else {
                System.out.printf("%6s%6s", " ", "B");
            }
            System.out.printf("%6d", i + 2);
            if (userAnswer[i + 1] == 'A' || userAnswer[i + 1] == 'a') {
                System.out.printf("%6s%6s", "A", " ");
            } else {
                System.out.printf("%6s%6s", " ", "B");
            }
            System.out.printf("%6d", i + 3);
            if (userAnswer[i + 2] == 'A' || userAnswer[i + 2] == 'a') {
                System.out.printf("%6s%6s", "A", " ");
            } else {
                System.out.printf("%6s%6s", " ", "B");
            }
            System.out.println();
        }
    }
    private static void collateTheSumOfAllCounts(){
        String [] personalityTraits = new String[4];
        System.out.println("=".repeat(80));
        System.out.printf("%6s", "Total");
        int countsForTheAs = 0;
        int countsForTheBs = 0;
        for (int i = 0; i < 4; i++) {
            countsForTheAs = 0;
            countsForTheBs = 0;
            if (userAnswer[i] == 'a'){
                countsForTheAs++;
            }else {
                countsForTheBs++;
            }
            if(userAnswer[i+4] == 'a'){
                countsForTheAs++;
            }else{
                countsForTheBs++;
            }
            if(userAnswer[i+8] == 'a'){
                countsForTheAs++;
            }else{
                countsForTheBs++;
            }
            if (userAnswer[i+12] == 'a'){
                countsForTheAs++;
            }else{
                countsForTheBs++;
            }
            if(userAnswer[i+16] == 'a'){
                countsForTheAs++;
            }else{
                countsForTheBs++;
            }
            System.out.printf("%6d%6d%6s", countsForTheAs, countsForTheBs, " ");

            switch (i){

                case 0 -> {
                    if (countsForTheAs > countsForTheBs) {
                        personalityTraits[i] = "Extrovert";
                    } else {
                        personalityTraits[i] = "Introvert";
                    }
                }
                 case 1 -> {
                     if (countsForTheAs > countsForTheBs) {
                         personalityTraits[i] = "Sensing";
                     } else {
                         personalityTraits[i] = "Intuition";
                     }
                 }
                  case 2 -> {
                      if (countsForTheAs > countsForTheBs) {
                          personalityTraits[i] = "Thinking";
                      } else {
                          personalityTraits[i] = "Feeling";
                      }
                  }
                   case 3 ->{
                if (countsForTheAs > countsForTheBs){
                        personalityTraits[i] = "Judging";
                    }else{
                        personalityTraits[i] = "Perspective";
                    }
                }
            }
        }
        System.out.println();
        System.out.println("Your personality Traits are: ");
        System.out.println(Arrays.toString(personalityTraits));
        System.out.println();
        System.out.println("Thank you for taking the test, make sure to use this information to your advantage");
    }
}