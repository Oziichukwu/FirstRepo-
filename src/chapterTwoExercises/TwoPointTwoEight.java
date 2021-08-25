import java.util.Scanner;

public class TwoPointTwoEight{

public static void main(String[] args){
5
Scanner input = new Scanner(System.in);

	int radius;

	int diameter;

	double circumference;

	double area; 

	double pi = Math.PI;


System.out.println("Enter radius");

	 radius = input.nextInt();

	 area = pi * radius * radius;

	 circumference = 2 * pi * radius; 

	 diameter = 2 * radius;




System.out.printf("%d is the diameter%n", diameter);

System.out.printf("%.2f is the area%n", area);

System.out.printf("%.2f is the circumference%n", circumference);
}

}