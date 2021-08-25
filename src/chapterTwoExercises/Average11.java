import java.util.Scanner;

public class Average11{

public static void main(String[] args){


	Scanner input = new Scanner(System.in); 
int Score = 1;

	int total = 0;

	//int numberCounter = 1;

	int number = 1;

	while ( number <= 5){

		System.out.printf("Enter number %d:", number++);

		 number = input.nextInt();

		if ( number >= 0 && number <= 100){
		
		total += number;

		number++;

		}
		
				

	}

			int average =  total / 5;
		
			System.out.printf(" The Total is %d%n", total);

			System.out.printf(" The average is %d", average);

}



}