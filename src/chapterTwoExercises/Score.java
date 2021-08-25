// program that print scores



// prompt user for a score

// if  score is greater than or equal to 60 print pass

// if score is less than 60 print fail


import java.util.Scanner;

public class Score{
	


	public static void main(String[] args){


		Scanner input = new Scanner(System.in);

			System.out.print("Enter the Score:");

			 int score = input.nextInt();


		//if ( score >=60 )


			System.out.println( score >=60 ? "passed" : "Failed");


		//else

		//System.out.println("failed");


		}

	}