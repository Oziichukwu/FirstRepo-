import java.util.Scanner;

public class ClassAverage{

	public static void main(String[] args){


		Scanner input = new Scanner (System.in);

			int total = 0;

			int gradeCounter = 1;

			int average;

				while ( gradeCounter <= 10) {

					System.out.print(" Enter a grade:");

					int grade = input.nextInt();

					total = total + grade;

					gradeCounter = gradeCounter + 1;

				}

			average = total / 10;		
			
	
			System.out.printf("%n The Total of the 10 grades is: %d%n", total);

			System.out.printf("%n The Average is: %d%n", average);


		}


	}