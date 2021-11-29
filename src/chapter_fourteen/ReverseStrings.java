package chapter_fourteen;

public class ReverseStrings {

    public static void main(String[] args) {

        String letters = "i believe i can fly";

        System.out.println(reverseString(letters));
    }

    public static String reverseString(String letters){

        return new StringBuilder(letters).reverse().toString();
    }
}
