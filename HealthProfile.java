public class HealthProfile{

	private String firstName;
	
	private String lastName;

	private String gender;

	private String birthDate;

	private int birthDay;

	private int birthMonth;

	private int birthYear;

	private int height;

	private int weight;



	public HealthProfile( String firstName, String lastName, String gender, int birthDay, int birthMonth, int birthYear, int height, int weight){

		this.firstName = firstName;

		this.lastName = lastName;

		this.gender = gender;

		this.height = height;

		this.weight = weight;

		this.birthDate = birthDate;

		this.birthDay = birthDay;

		this.birthMonth = birthMonth;

		this.birthYear = birthYear;

		}

			public void setFirstName( String firstName){

			this.firstName = firstName;
	}

			public String getFirstName(){
				return firstName;
		}


			public void setLastName( String lastName){
			
				this.lastName = lastName;
		}

		public String getLastName(){

			return lastName;
		}

		public void setGender(String gender){

		this.gender = gender;
			}

		public String getGender(){

			return gender;
		}

			public void setBirthDay( int birthDay){

				this.birthDay = birthDay; 
		}

			public int getBirthDay(int birthDay){

				return birthDay;	
		}

		public void setBirthMonth(int birthMonth){

			this.birthMonth = birthMonth;
		}

			public int getBirthMonth(){

			return birthMonth;
		}

			public String birthDate(){

			return birthDay + "/ " +  birthMonth + "/" + birthYear; 
		}

			public void setBirthYear(int birthYear){

			this.birthYear = birthYear;
		}

			public int getBirthYear(){

			return birthYear;
		}


		public void setHeight(int height){

		this.height = height;
	}
 		public int getHeight(){

			return height;
		}

			public void setWeight(int weight){

			this.weight = weight;
		}

		public int getWeight(){
			
			return weight;
		}



					public int ageYear(){

			int ageYear = 2021 - birthYear;

				return ageYear;
		}

		public int maximumHeartRate(){

			int maximumHeartRate = 220 - ageYear();

				return maximumHeartRate;
		}	

			public int targetHeartRate(){

			int targetHeartRate =  (60 * maximumHeartRate() )  / 100;

				return targetHeartRate;
		}


		public double getBMI (){

				double BMI = (weight * 703) / (height * height); 

					return BMI;
		}
}