package chapterFour;

public class FourPointTwentyTwo {

    public static void main(String[] args) {

        int counter = 1;

        System.out.printf("%2s %10s%10s%14s%n", "N", "10 * N", "100 * N", "1000 * N");


        while (counter <= 5) {

         int   number1 = counter * 10;

         int   number2 = counter * 100;

          int  number3 = counter * 1000;

            System.out.printf("%2d %8d%10d%12d%n", counter, number1, number2, number3);

            counter++;
        }
    }
}