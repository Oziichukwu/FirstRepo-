import java.util.Scanner;

public class TwoPointSix{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter first number:");

	int num1 = input.nextInt();

System.out.print("Enter second number:");

	int num2 = input.nextInt();

System.out.print("Enter thrid number:");

	int num3 = input.nextInt();

int product = num1 * num2 * num3;

System.out.printf("product is %d%n", product);


}



}