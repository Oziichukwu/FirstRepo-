package chapterFiveExercises;

public class MultiplicationTable {

    public static void main(String[] args) {

        System.out.printf("%35s%n", "Multiplication Table");

        System.out.print("  ");
        for (int i = 1; i <= 12; i++)
            System.out.print("   " + i);
        System.out.println("\n   ------------------------------------------------");

        for (int j = 1; j <= 12; j++) {
            System.out.print(j + "|");

            for (int k = 1; k <=12 ; k++) {
                System.out.printf("%4d" , k * j);
            }
            System.out.println();
        }
    }
}
