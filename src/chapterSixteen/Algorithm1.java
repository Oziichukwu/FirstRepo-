package chapterSixteen;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Algorithm1 {

    public static void main(String[] args) {

        Character [] letters = {'P', 'C', 'M'};

        List<Character> list = Arrays.asList(letters);

        System.out.println("list contains: ");

        System.out.printf("%s ", list);

        System.out.println();

        Collections.reverse(list);
        System.out.printf("%s ", list);

        System.out.println();

        Character [] letterCharacter = new Character[3];
        List<Character> copyList = Arrays.asList(letterCharacter);

        Collections.copy(copyList, list);
        System.out.printf("%s ", copyList);

        System.out.println();

        Collections.fill(list, 'T');
        System.out.printf("%s ", list);

    }

//    private static void output(List<Character> list) {
//
//    }
}
