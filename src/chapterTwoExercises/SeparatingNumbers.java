import java.util.Scanner;

public class SeparatingNumbers{

	public static void main(String[] args){

		Scanner  input = new Scanner(System.in);

		int number = 1;
		
		int counter = 1; 
		 
	
				while ( counter <= 5){
		
		          System.out.print("Enter a number" + counter++ +":");
		 
			          number = input.nextInt();
				
			if ( counter == 1)

			number = number / 10000;
	

			if (counter == 2)

			number = (number % 10000) / 1000;

			if (counter == 3)

			number = ((number % 10000) % 1000) / 100;

			if (counter == 4)

				number = (((number % 10000) % 1000) % 100) / 10;

			if (counter == 5)

					number = ((((number % 10000) % 1000) % 100) % 10);
			if (counter > 5)
			break;

		}

			counter++;
			
			System.out.printf(" %d ", number);

			
		}



		}