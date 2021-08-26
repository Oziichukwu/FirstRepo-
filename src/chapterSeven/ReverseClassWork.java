package chapterSeven;

import java.util.Scanner;

public class ReverseClassWork {

   private static Scanner input = new Scanner(System.in);
   private static String name = " ";

    public static void main(String[] args) {
        collectNameFromUser();
        getReverseName();
    }
    private static void collectNameFromUser(){
        System.out.println("Enter the Name");
        name = input.nextLine();
    }

    private static void getReverseName() {
        for (int i = name.length(); i > 0; i--) {
            System.out.print(" " + name.charAt(i - 1));
        }
    }
}