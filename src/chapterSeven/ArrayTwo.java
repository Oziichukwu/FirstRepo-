package chapterSeven;

public class ArrayTwo {

    public static void main(String[] args) {
        getFirstArray();
        getSecondArray();
        getThirdArray();
    }

    public static String []getFirstArray() {

        String[] array1 = {"X", "O", "X"};

        for (int i = 0; i < array1.length; i++) {

            System.out.print(" " + array1[i]);
        }
        System.out.println();
        return array1;
    }

    public static String [] getSecondArray(){

        String [] array2 = {"O","X","O"};

        for (int i = 0; i < array2.length; i++) {

            System.out.print(" " + array2[i]);
        }
        System.out.println();
        return array2;
    }
    public static String [] getThirdArray(){

        String [] array3 = {"X","O","X"};

        for (int i = 0; i < array3.length; i++) {

            System.out.print(" " + array3[i]);
        }
        return array3;
    }
}
