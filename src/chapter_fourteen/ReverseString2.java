package chapter_fourteen;

public class ReverseString2 {

    public static void main(String[] args) {
        String letters = "Do you beleive you can fly";
        System.out.println(reverseStringTwo(letters));
    }

    public static String reverseStringTwo(String letters){

        char [] charArray = letters.toCharArray();
        char temp;
        for (int i = 0, j = charArray.length-1; i < j; i++, j--) {
            temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
        }
        return new String(charArray);
    }
}
