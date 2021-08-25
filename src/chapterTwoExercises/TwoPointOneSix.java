import java.util.Scanner;

public class TwoPointOneSix{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter first number\n");

int num1 = input.nextInt();

System.out.print("Enter a second number\n");

int num2 = input.nextInt();


if (num1 > num2)

System.out.println("number 1 is Larger");

if (num2 > num1)

System.out.println("number 2 is Larger");

if (num1 == num2)

System.out.println("These numbers are equal");
}


}