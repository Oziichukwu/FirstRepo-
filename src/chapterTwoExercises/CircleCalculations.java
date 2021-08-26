package chapterTwoExercises;

import java.util.Scanner;

public class CircleCalculations {

     Scanner input = new Scanner(System.in);

    public void displaysCalculationSet() {
        String prompt = """
                1. Enter 1 for calculation on the diameter of the circle
                2. Enter 2 for calculation on the circumference of the circle
                3. Enter 3 for calculation on the area of the circle
                4. Enter 4 for calculation on the diameter of a sphere
                5. Enter 5 for calculation on the volume of a sphere
                6. Enter 6 for calculation on the surface area of a sphere
                """;
        System.out.println(prompt);
    }

     public void getUserSpecificCalculations(){
         System.out.println("Kindly Enter your desired calculation");
        int number = input.nextInt();

        switch (number) {
            case 1:
                calculateDiameterOfTheCircle();
                break;
            case 2:
                calculateCircumferenceOfTheCircle();
                break;
            case 3:
                calculateAreaOfTheCircle();
                break;
            case 4:
                calculateDiameterOfTheSphere();
                break;
            case 5:
                calculateVolumeOfASphere();
                break;
            case 6:
                calculateSurfaceAreaOfASphere();
                break;
            default:
                displaysCalculationSet();
                break;
        }
    }

    private int collectInputFromUser(){
        int radius;
        System.out.println("Enter the desired radius");
        radius = input.nextInt();
        return radius;
    }

    private void calculateDiameterOfTheCircle(){
        double diameterOfTheCircle = 2 * collectInputFromUser();
        System.out.printf("%s%.2f%n", "The diameter of the circle is: " , diameterOfTheCircle);
    }

    private void calculateCircumferenceOfTheCircle(){
        double circumferenceOfTheCircle = 2 * Math.PI * collectInputFromUser();;
        System.out.printf("%s%.2f%n", "The circumference of the circle is: " , circumferenceOfTheCircle);
    }

    private void calculateAreaOfTheCircle(){
        double areaOfTheCircle =  Math.PI * Math.pow(collectInputFromUser(),2);
        System.out.printf("%s%.2f%n","The area of the circle is: " , areaOfTheCircle);
    }

    private void calculateDiameterOfTheSphere(){
        double diameterOfTheSphere = 2 * collectInputFromUser();
        System.out.printf("%s%.2f%n","The diameter of the sphere is: " , diameterOfTheSphere);
    }

    private void calculateSurfaceAreaOfASphere(){
        double surfaceAreaOfASphere = 4 * Math.PI * Math.pow(collectInputFromUser(),2);
        System.out.printf("%s%.2f%n","The surface area of the sphere is: " , surfaceAreaOfASphere);
    }
    private void calculateVolumeOfASphere(){
        double volumeOfASphere = (4/3) * Math.PI * Math.pow(collectInputFromUser(),2);
        System.out.printf("%s%.2f%n","The volume of a sphere is: " , volumeOfASphere);
    }
}
