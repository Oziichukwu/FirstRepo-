public class FivePointTwoFour {


    public static void main(String[] args) {
//
//        for (int a = 5; a >= 1; a--){
//
//            for ( int b = 1; b <= 5-a; b++){
//
//                System.out.print(" ");
//            }
//            for( int d =1; d<=a; d++) {
//                System.out.print("* ");
//            }
//            System.out.println( );
//        }
//    }
//}


        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= 5 - i; j++) {

                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int a = 5; a >= 1; a--){

            for ( int b = 1; b <= 5-a; b++){

                System.out.print(" ");
            }
            for( int d =1; d<=a; d++) {
                System.out.print("* ");
            }
            System.out.println( );
        }
    }
}





