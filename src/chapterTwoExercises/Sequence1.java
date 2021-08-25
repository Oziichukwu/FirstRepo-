import java.util.Scanner;

public class Sequence{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

	int num1;

	int num2;

	int num3;

	int num4;

	int num5;

System.out.print("Enter first number:");

	num1 = input.nextInt();

System.out.print("Enter second number:");

	num2 = input.nextInt();

System.out.print("Enter third number:");

	num3 = input.nextInt();

		num4 = num3 + 1;

		num5 = num4 - 1;
		

	if (num4 > num3)

		System.out.printf("%d%n is the fourth", num4);

	if (num5 > num4)

		System.out.printf("%d%n is the fourth", num4);

		

}

}