
import java.util.Scanner;

public class Factors{

 	public static void main(String[] args){


		int number = 0;

		int counter = 1;


		Scanner input = new Scanner(System.in);


		System.out.print("Enter a number:");

		number = input.nextInt();

		//System.out.printf("The factors of %d are:", number);

		while ( counter <= number){

			 if ( number % counter == 0)

			System.out.print("  " + counter);


			counter++;

			}
 
System.out.printf("The factors of %d are:", number);

		}

}