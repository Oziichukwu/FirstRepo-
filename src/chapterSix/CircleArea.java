package chapterSix;

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of the circle");
        double radius = input.nextInt();
        System.out.printf("%s%.2f","The area of the circle is ",areaOfACircle(radius));
    }

    private static double areaOfACircle(double radius){
        return Math.PI * radius * radius;
    }
}
