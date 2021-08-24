package chapterSeven;

import java.util.Arrays;
import java.util.Collections;

public class ArraySorting {
    public static void main(String[] args) {

        int [] array1 ;
        array1 = new int[6];

            array1[0] = 34; array1[1] = 60; array1[2] = 89; array1[3] = 45;
            array1[4] = 67; array1[5] = 90;

            Integer [] array2 = new Integer[array1.length];

        for (int i = 0; i < array1.length; i++) {

            array2[i] = new Integer(array1[i]);
        }

        Arrays.sort(array2, Collections.reverseOrder());

        for (int i = 0; i < array1.length; i++) {
            System.out.println("num: " + array2[i] + i);
        }

    }
}
