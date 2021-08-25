package chapterFiveExercises;

public class PrintingPyramids<row> {

    public static void main(String[] args) {


        for (int row = 1; row <= 11; row++) {
            int tot = 0;
            for (int j = 1; j <= row; j++) {
                tot +=1;
                System.out.print(" " + tot);
            }
            System.out.println();
        }
        for (int i = 10; i >= 1; i--) {
            int sum = 0;
            for (int j = 1; j <= i; j++) {
                sum += 1;
                System.out.print(" " + sum);
            }
            System.out.println();
        }

    }

}