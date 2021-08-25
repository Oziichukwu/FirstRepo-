//TwoPointPOneSeven largest and smallest

import java.util.Scanner;

public class TwoPointOneSeven3{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

	int num1;

	int num2;

	int num3;

	int smallest;	
	
	int largest;

System.out.print("Enter a first number:");

	num1 = input.nextInt();


System.out.print("Enter a second number:");

	num2 = input.nextInt();


System.out.print("Enter a third number:");

	num3 = input.nextInt();


		smallest = num1;

	if (num2 < smallest)

		smallest = num2;
			
	
		if (num3 < smallest)

			smallest = num3;

		largest = num1;

	if (num2 > largest)

		largest = num2;


		if (num3 > largest)

			largest = num3;	


		System.out.printf("The largest is %d%n", largest);

		System.out.printf("The smallest is %d%n", smallest);
	
}


}