public class Employee{

	private String firstName;

	private String lastName;

	private double monthlySalary;

		public Employee( String firstName, String lastName, double monthlySalary){

		this.firstName = firstName;

		this.lastName = lastName;

		this.monthlySalary = monthlySalary;

		}

		public void firstName(String firstName){



		}

		public String getFirstname(){


			return firstName;
		}

		public void lastName(String lastName){


		}


		public String getLastname(){

			return lastName;

		}

		public void monthlySalary(double monthlySalary){

			//this.monthlySalary = monthlySalary;
		}

		public double getMonthlysalary(){
			
			return monthlySalary;

		}

			public double getYearlysalary(){

			monthlySalary = (monthlySalary * 10)/100 + monthlySalary;
			
			double Yearlysalary = monthlySalary * 12;

				return Yearlysalary;
		}

		
}