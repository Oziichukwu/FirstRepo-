import java.util.Scanner;

public class Example{

public static void main(String[] args){


Scanner input = new Scanner (System.in);


	int num1;

	int num2;

	int num3;

	int sum;

	int product;

	int average;

	int smallest;

	int largest;

System.out.print("Enter the first number:");

	num1 = input.nextInt();

System.out.print("Enter the second number:");

	num2 = input.nextInt();

System.out.print("Enter the third number:");

	num3 = input.nextInt();

		product = num1 * num2 * num3;

		sum = num1 + num2 + num3;

		average = (num1 + num2 + num3) / 3;

		smallest = num1;

			if (num2 < smallest )

				smallest = num2;

			if (num3 < smallest )

				smallest = num3;

		largest = num1;

			if (num2 > largest )

				largest = num2;

			if (num3 > largest)

				largest = num3;

System.out.printf("The sum is %d%n", sum);

System.out.printf("The product is %d%n", product);

System.out.printf("The average is %d%n", average);

System.out.printf("The largest is %d%n", largest);

System.out.printf("The smallest is %d%n", smallest);
		

}


}