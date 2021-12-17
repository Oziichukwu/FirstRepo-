package chapterSixteen;

import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.UpperCase;

import java.util.*;

public class LinkedListTest {

    public static void main(String[] args) {

        String [] colors = {"black", "yellow", "green", "blue", "violet", "silver"};

        List<String> list1 = new LinkedList<>(Arrays.asList(colors));

        String [] colors2 = {"gold", "white", "brown", "blue", "gray", "silver"};

        List<String> list2 = new LinkedList<>(Arrays.asList(colors2));

        list1.addAll(list2);
        list2 = null;

        printList(list1);

        convertToUpperCaseStrings(list1);

        System.out.printf("%nDeleting elements 4 to 6...");
        removeItems(list1, 4, 7);

        printList(list1);

        printReversedList(list1);

    }

    private static void removeItems(List<String> list1, int start, int end) {

        list1.subList(start, end).clear();
    }

    private static void printReversedList(List<String> list1) {

        ListIterator<String> iterator = list1.listIterator(list1.size());

        System.out.printf("%nReversed List:%n");
        while(iterator.hasPrevious()){
            System.out.printf("%s ", iterator.previous());
        }
    }

    private static void convertToUpperCaseStrings(List<String> list1) {
        ListIterator<String> iterator = list1.listIterator();

        while (iterator.hasNext()){
            String color = iterator.next();
            iterator.set(color.toUpperCase());
        }
    }

    private static void printList(List<String> list1) {

        System.out.printf("%nlist:%n");

        for (String color : list1){
            System.out.printf("%s ", color);
        }

        System.out.println();
    }
}
