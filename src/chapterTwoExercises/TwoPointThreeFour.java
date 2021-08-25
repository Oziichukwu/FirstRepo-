import java.util.Scanner;

public class TwoPointThreeFour{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

	//int growthRate = 86900000;

	//int populationChange1 = 790000000;

	int time;

	int populationChange2;

System.out.print("Enter the number of years:\n");

	time = input.nextInt();

populationChange2 = 86900000 * time + 790000000;


System.out.printf("world population after %d years would be %d%n", time, populationChange2);
		

}

}