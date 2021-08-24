package chapterFiveExercises;

public class FivePointFourteen {

public static void main(String[] args) {

        int number = 5;

        double amount;

        double principal = 1000.0;

        while (number <= 10) {
            System.out.println();
            System.out.printf("%s%30s%d%s%n", "year", "Amount on deposit at ", number, "%");

                double rate = number / 100.0;

            for ( int year = 1; year <= 10; year++){

                    amount = principal * Math.pow( 1.0 + rate, year);

                    System.out.printf("%d%25.2f%n", year, amount);
           }
            number++;
        }

    }
}
