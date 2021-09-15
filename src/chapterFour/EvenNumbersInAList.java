package chapterFour;

import java.util.Arrays;

public class EvenNumbersInAList {
    public static void main(String[] args) {

        int[] numbers = {23, 45, 67, 89, 90, 86, 80, 21, 22, 12, 11};
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }
    }
}
