import java.util.Scanner;

public class GuessNumber{

    public static void main(String[] args){
	Scanner MysteryNumber = new Scanner(System.in);
	System.out.print("Guess a Number");

	int guess = MysteryNumber.nextInt();

		if (guess > 100){

		  System.out.println("Guess is too High");

}

		if (guess < 100){

		  System.out.println("Guess is too low");
} 


		if (guess == 100){

		  System.out.println("Absolutely Correct");

}

}