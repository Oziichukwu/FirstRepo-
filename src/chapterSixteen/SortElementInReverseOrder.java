package chapterSixteen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortElementInReverseOrder {

    public static void main(String[] args) {


    String [] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

    List<String> myList = Arrays.asList(suits);

    Collections.sort(myList, Collections.reverseOrder());

        System.out.printf("Sorted Elements in reversed order: %s%n", myList);

    }

}
