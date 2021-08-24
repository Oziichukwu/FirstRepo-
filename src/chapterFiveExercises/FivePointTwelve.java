package chapterFiveExercises;

public class FivePointTwelve {

    public static void main(String[] args) {

        int counter = 1;

        int product = 1;

        System.out.printf("The odd integers from 1 to 15 are:");

        while ( counter <= 15){

            if ( counter % 2 == 1) {

                product = counter * product;

                System.out.printf("%d ", counter);
            }
                counter++;
        }

       System.out.printf("\nThe product of the odd integers from 1 to 15 is: %d ", product );


    }
}
