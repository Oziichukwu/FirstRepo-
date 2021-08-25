// program that print scores



// prompt user for a score

// if  score is greater than equal to 90 and less than equal to 100

//	print A
//  else
// if  score is greater than equal to 80 and less than equal to 89

//	print B
 // else
// if  score is greater than equal to 70 and less than equal to 79

//	print C
//  else
// if  score is greater than equal to 60 and less than 69

//	print D

// else

//	print fail


import java.util.Scanner;

public class Scores{
	


	public static void main(String[] args){


		Scanner input = new Scanner(System.in);

			System.out.print("Enter the Score:");

			 int score = input.nextInt();


		if ( score >= 90 && score <= 100)

			System.out.print("Grade A");
		
		  else 

		  if ( score >=80 && score <= 89)

			System.out.print("Grade B");

		  else

		  if ( score >=70 && score <=79 )

			System.out.print("Grade C");

		  else

		  if ( score >=60 && score <= 69)

			System.out.print("Grade D");

		  else

			System.out.print("Grade F");

		}

	}



