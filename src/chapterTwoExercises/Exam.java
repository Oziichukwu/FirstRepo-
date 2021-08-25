import java.util.Scanner;

public class ExamTwo{

public static void main(String[] args){


		Scanner input = new Scanner(System.in);

		int passes = 0;

		int failures = 0;

		int resultCounter = 1;


		while ( resultCounter <= 10) {

		System.out.print(" Enter result( pass = 1 : failure = 2)");

			int result = input.nextInt(); 

			if ( result == 1)

				passes = passes + 1;


			else 

				failures = failures + 1;


			resultCounter = resultCounter + 1;

			}

		System.out.printf(" passed: %d%n  fails: %d%n", passes, failures);


			if ( passes > 8)

				System.out.println("Bonus to instructor");				
		
	}

	}