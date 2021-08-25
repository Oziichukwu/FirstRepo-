



import java.util.Scanner;

public class AverageExample{

public static void main(String[] args){


	Scanner input = new Scanner(System.in); 

	int total = 0;

	int numberOfValid = 1;


	while ( numberOfValid <= 3) {

	System.out.println(" Enter number" + ( numberOfValid++));

	int score = input.nextInt();


	if (score >= 0 && score <= 100){

		total = total + score;

		score++;

	}

		}

				int average =  total / numberOfValid;
		
			System.out.printf(" The Total is %d%n", total);

			System.out.printf(" The average is %d", average);


	}

		}