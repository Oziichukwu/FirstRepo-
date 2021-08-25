package chapterThree11;

import java.util.Scanner;

public class Days {

    public static void main(String[] args) {

        int proposedDay = 0;

        int currentDay = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the current day");

         currentDay = input.nextInt();

        System.out.println("Enter proposed day(s)");

         proposedDay = input.nextInt();

            if (proposedDay >= 1) {

                int days = currentDay + proposedDay;


                if (days % 7 == 0)

                    System.out.printf("The day after %d day(s) will be: %s", proposedDay, "Saturday");

                else if (days % 7 == 6)

                    System.out.printf("The day after %d day(s) will be: %s", proposedDay, "Friday");
                else if (days % 7 == 5)

                    System.out.printf("The day after %d day(s) will be: %s", proposedDay, "Thursday");

                else if (days % 7 == 4)

                    System.out.printf("The day after %d day(s) will be: %s", proposedDay, "Wednesday");

                else if (days % 7 == 3)

                    System.out.printf("The day after %d day(s) will be: %s", proposedDay, "Tuesday");

                else if (days % 7 == 2)
                    System.out.printf("The day after %d day(s) will be: %s", proposedDay, "Monday");

                else if (days % 7 == 1)

                    System.out.printf("The day after %d day(s) will be: %s", proposedDay, "Sunday");
            }
        }
    }


