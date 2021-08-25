import java.util.Scanner;

public class TwoPointTwoEight1{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter radius");

	int radius = input.nextInt();

	double Pi = Math.PI;



	double circumference  = 2 * Pi * radius;




System.out.printf("%f is the circumference", circumference);

}

}