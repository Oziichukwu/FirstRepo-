package chapterSeven;

import java.security.SecureRandom;

public class DiceRolling3 {

    private  static final SecureRandom random = new SecureRandom();

    public static void main(String[] args) {

        int [] frequency = new int[13];

        for (int i = 0; i < 36; i++) {

            int die1 = 1 + random.nextInt(6);
            int die2 = 1 + random.nextInt(6);

            int sum = die1 + die2;

            ++frequency[sum];
        }

        System.out.printf("%s %s %n", "sum", "frequency");

        for (int i = 0; i < frequency.length; i++) {
            System.out.printf("%2d %10d%n", i, frequency[i]);
        }
    }
}
