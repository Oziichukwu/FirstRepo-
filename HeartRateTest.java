import java.util.Scanner;

public class HeartRateTest{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		
		HeartRate  myHeartRate = new HeartRate( "getFirstname", "getLastname ", 04,05,2021);

		System.out.print(" Enter firstName:");

		 	String firstName = input.next();
			myHeartRate.firstName(firstName);

		System.out.print(" Enter lastName:");

			String lastName = input.next();
			myHeartRate.lastName(lastName);

		System.out.print("Enter birthDay:");

			int birthDay = input.nextInt();
			myHeartRate.setBirthDay(birthDay);

		System.out.print("Enter birthMonth:");

			int birthMonth = input.nextInt();
			myHeartRate.setBirthMonth(birthMonth);

		System.out.print("Enter birthYear:");

			int birthYear = input.nextInt();
			myHeartRate.setBirthYear(birthYear);

		System.out.println("  ");
		System.out.println("  ");
		



	System.out.printf("firstName:%s%n", myHeartRate.getFirstname());
	System.out.printf("lastName:%s%n", myHeartRate.getLastname());	
	System.out.printf("birthDate:%s%n", myHeartRate.birthDate());
	System.out.printf("Age :%d%n", myHeartRate.ageYear());
	System.out.printf("Maximum Heart Rate:%d%n", myHeartRate.maximumHeartRate());
	System.out.printf("Target Heart Rate:%d%n", myHeartRate.targetHeartRate());
	

		}

}