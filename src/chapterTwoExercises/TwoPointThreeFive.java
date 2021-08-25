import java.util.Scanner;

public class TwoPointThreeFive{

public static void main(String[] args){

Scanner input = new Scanner(System.in);


	int drivingCostPerDay;

	int totalMiles;

	int gasolineCost; 

	int averageMilesPerGallon;

	int parkingFees;

	int tollsPerDay;

System.out.println("Application displays cost of driving per day");

		

System.out.println("Enter total miles driven per day:");

		totalMiles = input.nextInt();

System.out.println("Enter cost per gallon of gasoline:");
		
		gasolineCost = input.nextInt();

System.out.println("Enter Average miles per gallon:");

		averageMilesPerGallon = input.nextInt();

System.out.println("Enter parking fees per day:");

		parkingFees = input.nextInt();

System.out.println("Enter tolls per day:");
		
		tollsPerDay = input.nextInt();


drivingCostPerDay = (totalMiles / averageMilesPerGallon ) * gasolineCost + parkingFees + tollsPerDay;


System.out.printf("Your daily driving cost per day is $%d%n", drivingCostPerDay);

}


}