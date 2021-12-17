package chapterSixteen;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingInAscendingOrder {

    public static void main(String[] args) {

        String [] suits = {"Hearts", "Diamonds", "Clubs", "Spade"};

        List<String> list = Arrays.asList(suits);

        Collections.sort(list);

        System.out.printf("Sorted Array Elements: %s%n ", list);
    }
}
