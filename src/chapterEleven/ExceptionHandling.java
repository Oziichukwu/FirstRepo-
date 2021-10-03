package chapterEleven;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) {

        int firstNumber = input("Enter first Number");
        int secondNumber = input("Enter second Number");
        try {
            System.out.printf("The answer is %d ", firstNumber / secondNumber);
        } catch (ArithmeticException ep) {
            if (firstNumber == 0) {
                System.out.println("first number cannot be zero");
                System.out.println("Kindly enter a valid input");
            } else if (secondNumber == 0) {
                System.out.println("second number cannot be zero");
                System.out.println("Kindly enter a valid input");
            }
        }
    }

    private static int input(String prompt) {
        Scanner input = new Scanner(System.in);
        System.out.println(prompt);
        try {
            return input.nextInt();
        }
        catch (InputMismatchException ex) {

            System.out.println("kindly renter a valid input");
            return input(prompt);
        }
    }

    private static void thisMethodMightCatchException(){
        try{
        throwException();}
        catch (Exception ex){

            System.out.println("this method handles the exception that was thrown initially");
        }
    }

    private static int throwException() throws Exception{

        System.out.println();
        throw new Exception("enter what you want to throw here");
    }
}



//      Question [] questions = {
//                                    {"Questions 1: a.expand energy, enjoy groups  b.conserve energy, enjoy one-one"},
//                                    {"Question 2: a. interpret literal  b. look for meaning and possibilities"},
//                                    {"Question 3: a. logical,thinking,questioning b. empathetic, feeling, accommodating"},
//                                    {"Question 4: a. organized, orderly b. flexible, adaptable"},
//                                    {"Question 5: a. more outgoing, think out loud b. more reserved, think to yourself"},
//                                    {"Question 6: a. practical, realistic, experiential b. imaginative, innovative, theoretical"},
//                                    {"Question 7: a. candid, straight forward, frank b. tactful, kind, encouraging"},
//                                    {"Question 8: a. plan, schedule b. unplanned, sponteneous"} ,
//                {"Question 9: a. seek many tasks public activities, interaction with others b. seek private, solitary activities with quiet to concentrate"},
//                                    {"Question 10: a. standard, usual, conventional b. different, novel, unique"},
//                {"Question 11: a. firm, tend to criticize, hold the line b. gentle, tend to appreciate, conciliate"},
//              {"Question 12: a. regulated, structured b. easy going live"},
//              {"Question 13: a. external, communicative, express yourself b. internal, reticent, keep to yourself"},
//              {"Question 14: a. focus on here and now b. look to the future, global perspective, \"big picture\""},
//              {"Question 15: a. tough-minded, just b. tender-hearted, merciful"},
//              {"Question 16: a. preparation, plan ahead b. go with the flow, adapt as you go"},
//              {"Question 17: a. active, initiate b. reflective, deliberate"},
//              {" Question 18: a. facts, things \"what is\" b. ideas, dreams, \"what could be,\" philosophical"},
//              {" Question 19: a. matter of fact, issue-oriented b. sensitive, people-oriented, compassionate"},
//              {" Question 20: a. control, govern b. latitude, freedom"}
//