package chapterSixteen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CollectionTest {
    public static void main(String[] args) {


        String[] colors = {"red", "blue", "orange", "pink", "yellow", "gold"};

        List<String> list = new ArrayList<>(Arrays.asList(colors));

        String [] removeColors = {"red", "orange", "pink"};

       List<String> removeList = new ArrayList<>(Arrays.asList(removeColors));

        System.out.println("ArrayList: ");

        for (String color : list){
            System.out.printf("%s ", color);
        }

        removeColor(list, removeList);

        System.out.printf("%n%nArrayList after calling removeColors:%n");

        for (String color : list){
            System.out.printf("%s ", color);
        }
    }

    private static void removeColor(List<String> list, List<String> removeList) {

        list.removeIf(removeList::contains);

    }

}
