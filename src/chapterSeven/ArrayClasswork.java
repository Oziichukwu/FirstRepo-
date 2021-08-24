package chapterSeven;

public class ArrayClasswork {

    public static void main(String[] args) {

        displayArray();
    }
        public static String [][] displayArray(){

            String [][] arrays =  {{"X","O","X"}, {"O","X","O"}, {"X","O","X"} };

            for (int i = 0; i < arrays.length; i++) {

                for (int j = 0; j < arrays[i].length; j++) {

                    System.out.print(" " + arrays[i][j]);
                }
                System.out.println();
            }
       return arrays;
    }
}

