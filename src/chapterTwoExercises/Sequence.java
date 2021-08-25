import java.util.Scanner;

public class Sequence{

public static void main(String[] args){


Scanner input = new Scanner(System.in);

	int num1;

	int num2;

	int num3;

	int sequence;

	int num4;

System.out.println("Enter the first number");

	num1 = input.nextInt();


System.out.println("Enter the second number");

	num2 = input.nextInt();

System.out.println("Enter the third number");

	num3 = input.nextInt();


	sequence = num3 + num2;

	num4 = sequence - num1; 


	System.out.printf("The fourth number is %d%n", num4);

}


}