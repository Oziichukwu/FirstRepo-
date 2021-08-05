import java.util.Scanner;

public class HealthProfileTest{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		
		HealthProfile  myHealthProfile = new HealthProfile( "yemi", "femi","male",05,04,2021, 67,15);

		System.out.print(" Enter firstName:");

		 	String firstName = input.next();
			myHealthProfile.setFirstName(firstName);

		System.out.print(" Enter lastName:");

			String lastName = input.next();
			myHealthProfile.setLastName(lastName);

		
		System.out.print(" Enter gender:");

			String gender = input.next();
			myHealthProfile.setGender(gender);

		System.out.print("Enter birthDay:");

			int birthDay = input.nextInt();
			myHealthProfile.setBirthDay(birthDay);

		System.out.print("Enter birthMonth:");

			int birthMonth = input.nextInt();
			myHealthProfile.setBirthMonth(birthMonth);

		System.out.print("Enter birthYear:");

			int birthYear = input.nextInt();
			myHealthProfile.setBirthYear(birthYear);

		
		System.out.print("Enter weight(in pounds):");

			int weight = input.nextInt();
			myHealthProfile.setWeight(weight);

		System.out.print("Enter height(in inches):");

			int height = input.nextInt();
			myHealthProfile.setHeight(height);

		System.out.println("  ");
		System.out.println("  ");
		



	System.out.printf("firstName:%s%n", myHealthProfile.getFirstName());
	System.out.printf("lastName:%s%n",myHealthProfile.getLastName());	
	System.out.printf("birthDate:%s%n", myHealthProfile.birthDate());
	System.out.printf("Age :%d%n", myHealthProfile.ageYear());
	System.out.printf("Maximum Heart Rate:%d%n", myHealthProfile.maximumHeartRate());
	System.out.printf("Target Heart Rate:%d%n", myHealthProfile.targetHeartRate());

	System.out.println("  ");
	
System.out.printf("Your body mass index is %f%n", myHealthProfile.getBMI());

System.out.print("BMI  VALUES\n");

System.out.printf("Underweight:\t less than %f\n", 18.5);

System.out.printf("Normal:\t\t between %f and %f\n", 18.5, 24.9);

System.out.printf("Overweight:\t between %d and %f\n", 25, 29.9);

System.out.printf("Obese:\t\t %d or greater\n", 30);

	

		

}

}