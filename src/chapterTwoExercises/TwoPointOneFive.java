import java.util.Scanner;

public class TwoPointOneFive{

public static void main(String[] args){

Scanner input = new Scanner(System.in);


System.out.print("Enter first number:");

	int num1 = input.nextInt();

System.out.print("Enter a second number:");

	int num2 = input.nextInt();

int sum = num1 + num2;

System.out.printf("sum is %d%n", sum);
}


}