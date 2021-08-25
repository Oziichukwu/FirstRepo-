//TwoPointPOneSeven  Average

import java.util.Scanner;

public class TwoPointOneSeven1{

public static void main(String[] args){

Scanner input = new Scanner(System.in);


System.out.print("Enter a first number:");

	int num1 = input.nextInt();


System.out.print("Enter a second number:");

	int num2 = input.nextInt();


System.out.print("Enter a third number:");

	int num3 = input.nextInt();


	int average = (num1 + num2 + num3)/3;

System.out.printf("average is %d%n", average); 
}


}