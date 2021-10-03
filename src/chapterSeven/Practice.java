package chapterSeven;

import java.util.Arrays;

public class Practice {

    public static void main(String[] args) {

        int [] count = new int[10];
        for (int i = 0; i < count.length; i++) {
            count[0]++;
        }
        System.out.println(count[0]);

        Arrays.fill(count,7);
        System.out.println(Arrays.toString(count));
        count = new int[10];
        System.out.print(Arrays.toString(count));
    }
}
