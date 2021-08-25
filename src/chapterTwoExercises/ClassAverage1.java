import java.util.Scanner;

public class ClassAverage1{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

			int total = 0;

			int gradeCounter = 0;

		System.out.print("Enter grade or -2 to exit:");

			int grade = input.nextInt();

			while ( grade != -2 )	{

				total = total + grade;

				gradeCounter++;

				System.out.print("Enter grade or -2 to exit:");

				grade = input.nextInt();
			

			double average = (double) total / gradeCounter;

				System.out.printf("The number of grade inputted is %d%n:", gradeCounter);
				System.out.printf("The Total is %d%n:", total);
				System.out.printf("The Average is %.2f%n:", average);
			}

						if ( gradeCounter == 0){

				System.out.println("No grades inputted"); } 
					
	}

		}