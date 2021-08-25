import java.util.Scanner;

public class TwoPointThreeZero{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

	int num, num1, num2, num3, num4, num5;


System.out.print("Enter a five digit number:");

	num = input.nextInt();

		num1 = num / 10000;

		num2 = (num % 10000) / 1000;

		num3 = ((num % 10000) % 1000) / 100;

		num4 = (((num % 10000) % 1000) % 100) / 10;

		num5 = (((num % 10000) % 1000) % 100) % 10;

System.out.printf("%d%s%d%s%d%s%d%s%d%n", num1, " ", num2, " ", num3, " ", num4, " ", num5);


}

}