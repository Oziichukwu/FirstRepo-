
import java.util.Scanner;

public class TwoPointThreeThree{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

	int weight;

	int height;

	double BMI;

System.out.print("Enter weight(in pounds):");

	weight = input.nextInt();

System.out.print("Enter height(in inches):");

	height = input.nextInt();


		BMI = (weight * 703) / (height * height); 


System.out.printf("Your body mass index is %f%n", BMI);

System.out.print("BMI  VALUES\n");

System.out.printf("Underweight:\t less than %f\n", 18.5);

System.out.printf("Normal:\t\t between %f and %f\n", 18.5, 24.9);

System.out.printf("Overweight:\t between %d and %f\n", 25, 29.9);

System.out.printf("Obese:\t\t %d or greater\n", 30);

}

}