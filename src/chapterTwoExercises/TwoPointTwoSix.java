import java.util.Scanner;

public class TwoPointTwoSix{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter a number:");

	int num1 = input.nextInt();

System.out.println("Enter a second number");	

	int num2 = input.nextInt();


	if (num2 % num1 == 0 )

	System.out.printf("%d is a multiple of %d", num1, num2);

	if (num2 % num1 !== 0 )

	System.out.printf("%d is not a multiple of %d", num1, num2);
	
	
}

}
