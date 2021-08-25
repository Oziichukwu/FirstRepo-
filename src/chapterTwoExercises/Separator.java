import java.util.Scanner;

public class Separator{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

	int num;

System.out.print("Enter a number:");

	num = input.nextInt();


		if ( num % 2 == 0 )


			System.out.printf("%d is Even", num);


		if (num % 2 == 1)


			System.out.printf("%d is Odd", num);


}

}