package chapterFiveExercises;

public class FivePointFifteen {

    public static void main(String[] args) {
//
//        String numberOfSides = "*";
//
//        String counter = "";
//
//        int number = 1;
//
//        while ( number <= 10) {
//
//                counter = counter + numberOfSides;
//
//            System.out.println("  " + counter);
//
//            number++;
//


       // }
//

        for (int row = 1; row <= 10; row++) {
            int tot = 0;
            for (int j = 1; j <= row; j++) {
                tot +=1;
                System.out.print(" " + tot);
            }
            System.out.println();
        }


        for (int i = 10; i >= 1; i--){
            int sum = 0;
                for ( int j = 1; j <= i; j++){
                    sum += 1;
                System.out.print(" " + sum );
                }
                System.out.println();
        }
    }
}




//
//
//        for (int i = 1; i <= 10; i++){
//
//                for ( int j = 1; j <= 10-i; j++){
//
//                    System.out.print(" ");
//                }
//                for( int k =1; k<=i; k++) {
//                    System.out.print("*");
//                }
//            System.out.println( );
//        }
//    }
// }
