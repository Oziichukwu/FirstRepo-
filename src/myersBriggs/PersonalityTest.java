package myersBriggs;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class PersonalityTest {
    public static void main(String[] args) {

        System.out.println("""
                Welcome to Meyers Briggs Personality Test
                You are to answer 20 questions
                For each question, you are allowed to choose either A or B (a or b)
                """);
        String[] questions =
                {"""
                            Question 1:
                            a.expend energy, enjoy groups or
                            b.conserve energy, enjoy one-on-one
                         """,
                        """
                            Question 2:
                            a.interpret literally or
                            b.look for meaning and possibilities
                            """,
                        """
                            Question 3:
                            a.logical, thinking, questioning or
                            b.empathetic, feeling, accommodating
                            """,
                        """
                            Question 4:
                            a. organized, orderly or
                            b. flexible, adaptable
                            """,
                        """
                            Question 5:
                            a.more outgoing, think out loud or
                            b.more reserved, think to yourself
                            """,
                        """
                            Question 6:
                            a.practical, realistic, experiential or
                            b.imaginative, innovative, theoretical
                            """,
                        """
                            Question 7:
                            a. candid, straight forward, frank or
                            b. tactful, kind, encouraging
                            """,
                        """
                            Question 8:
                            a. plan, schedule or
                            b. unplanned, spontaneous
                            """,
                        """
                            Question 9:
                            a.seek many tasks, public activities, interaction with others
                            b.seek private, solitary activities with quiet to concentrate
                            """,
                        """
                            Question 10:
                            a.standard, usual, conventional or
                            b.different, novel, unique
                            """,
                        """
                            Question 11:
                            a.firm, tend to criticize, hold the line or
                            b.gentle, tend to appreciate, conciliate
                            """,
                        """
                            Question 12:
                            a.regulated, structured or
                            b.easygoing, “live” and “let live”
                            """,
                        """
                            Question 13:
                            a.external, communicative, express yourself or
                            b.internal, reticent, keep to yourself
                            """,
                        """
                            Question 14:
                            a.focus on here-and-now or
                            b.look to the future, global perspective, “big picture”
                            """,
                        """
                            Question 15:
                            a.tough-minded, just or
                            b.tender-hearted, merciful
                            """,
                        """
                            Question 16:
                            a.preparation, plan ahead or
                            b.go with the flow, adapt as you go
                            """,
                        """
                            Question 17:
                            a.active, initiate or
                            b.reflective, deliberate
                            """,
                        """
                            Question 18:
                            a.facts, things, “what is” or
                            b.ideas, dreams, “what could be,” philosophical
                            """,
                        """
                            Question 19:
                            a.matter of fact, issue-oriented or
                            b.sensitive, people-oriented, compassionate
                            """,
                        """
                            Question 20:
                            a.control, govern or
                            b.latitude, freedom
                            """
                };
        Scanner input = new Scanner(System.in);

        char[] Useranswer = new char[questions.length];
        char collateAnswers;

        for (int j = 0; j < questions.length; j++) {

            System.out.println(questions[j]);
            System.out.print("Enter the options: ");
            collateAnswers = input.next().charAt(0);
            if (collateAnswers == 'A' || collateAnswers == 'B' || collateAnswers == 'a' || collateAnswers == 'b') {

                Useranswer[j] = collateAnswers;
            }
        }
        System.out.println("Personality test results");

        String display = String.format("%6s%6s%6s", " ", "A", "B");
        System.out.printf(display.repeat(4));
        System.out.println();
        System.out.println("=".repeat(80));
        for (int j = 1; j <= questions.length; j += 4) {
            System.out.printf("%6d", j);
            if (Useranswer[j - 1] == 'A' || Useranswer[j - 1] == 'a') {
                System.out.printf("%6s%6s", "A", " ");
            } else {
                System.out.printf("%6s%6s", " ", "B");
            }
            System.out.printf("%6d", j + 1);
            if (Useranswer[j] == 'A' || Useranswer[j] == 'a') {
                System.out.printf("%6s%6s", "A", " ");
            } else {
                System.out.printf("%6s%6s", " ", "B");
            }
            System.out.printf("%6d", j + 2);
            if (Useranswer[j + 1] == 'A' || Useranswer[j + 1] == 'a') {
                System.out.printf("%6s%6s", "A", " ");
            } else {
                System.out.printf("%6s%6s", " ", "B");
            }
            System.out.printf("%6d", j + 3);
            if (Useranswer[j + 2] == 'A' || Useranswer[j + 2] == 'a') {
                System.out.printf("%6s%6s", "A", " ");
            } else {
                System.out.printf("%6s%6s", " ", "B");
            }
            System.out.println();
        }
        int countsOfAs = 0;
        int countsOfBs = 0;
        System.out.println("=".repeat(80));
        System.out.printf("%6s", "Total");
        String [] collatePersonalities = new String[4];
        for (int j = 0; j < 4; j++) {
            countsOfAs = 0;
            countsOfBs = 0;
                if (Useranswer[j] == 'A' || Useranswer[j] == 'a'){
                    countsOfAs++;
                } else {
                    countsOfBs++;
                }
            if (Useranswer[j+4] == 'A' || Useranswer[j+4] == 'a'){
                countsOfAs++;
            }else {
                countsOfBs++;
            }
            if (Useranswer[j+8] == 'A' || Useranswer[j+8] == 'a'){
                countsOfAs++;
            }else {
                countsOfBs++;
            }
            if (Useranswer[j+12] == 'A' || Useranswer[j+12] == 'a'){
                countsOfAs++;
            }else {
                countsOfBs++;
            }
            if(Useranswer[j+16] == 'A' || Useranswer[j+16] == 'a'){
                countsOfAs++;
            }else {
                countsOfBs++;
            }
            System.out.printf("%6d%6d%6s", countsOfAs, countsOfBs, " ");

            switch (j){

                case 0 -> {
                    if (countsOfAs > countsOfBs){
                        collatePersonalities[j] = "Extrovert";
                    }else{
                        collatePersonalities[j] = "Introvert";                    }
                }
                case 1 -> {
                    if (countsOfAs > countsOfBs){
                        collatePersonalities[j] = "Sensing";
                    }else{
                        collatePersonalities[j] = "Intuition";
                    }
                }
                case 2 -> {
                    if (countsOfAs > countsOfBs){
                        collatePersonalities[j] = "Thinking";
                    }else{
                        collatePersonalities[j] = "Feeling";
                    }
                }
                case 3 -> {
                    if (countsOfAs > countsOfBs){
                        collatePersonalities[j] = "Judging";
                    }else{
                        collatePersonalities[j] = "Perspective";
                    }
                }
            }
        }
        System.out.println();
        System.out.println("Your personality Traits are: ");
        System.out.println(Arrays.toString(collatePersonalities));
        }
    }


