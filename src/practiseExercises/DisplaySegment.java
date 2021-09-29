package practiseExercises;

public class DisplaySegment {

    public static void main(String[] args) {

//        char[] characters = {'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'};
//
//        for (int i = 1; i < characters.length; i++) {
//
//                System.out.print(characters[i]);
//            if ( i % 4 == 0 ) {
//                System.out.println();
//            }
//        }
//    }

        String [][] numbers = {{"#","#","#","#"},{"#"," "," ","#"},{"#","#","#","#"},{"#"," "," ","#"},{"#","#","#","#"}};

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {

                System.out.print(" " + numbers[i][j]);
            }
            System.out.println();
        }
    }
}