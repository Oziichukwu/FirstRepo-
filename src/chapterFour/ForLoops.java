

package chapterFour;

import java.util.Scanner;

public class ForLoops {

    public static void main(String[] args) {
        int sum = 1;
        for (int row = 0; row <= 6; row++) {
            for (int col = 0; col < row+1; col++) {
                    sum = col + 1;
                System.out.print(" " + sum);
            }
            System.out.println();
        }
    }
}
