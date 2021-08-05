public class HeartRate{

	private String firstName;

	private String lastName;

	private int birthMonth;

	private int birthDay;

	private int birthYear;

		public HeartRate( String firstName, String lastName, int birthDay, int birthMonth, int birthYear){
	
			this.firstName = firstName;

			this.lastName = lastName;

			this.birthDay = birthDay;

			this.birthMonth = birthMonth;

			this.birthYear = birthYear;
		}

// maximum heartrate in beats per minutes = 220 - age in years

// target heart rate is a range 50 - 85 % of the maximun heart rate


	public void setBirthMonth( int birthMonth ){

		this.birthMonth = birthMonth;
	}

		public void setBirthDay(int birthDay){

			this.birthDay = birthDay;
		}

		public void setBirthYear(int birthYear){

			this.birthYear = birthYear;
		}

	public void firstName(String firstName){

		this.firstName = firstName;				

	}

	public String getFirstname(){

		return firstName;
	}

	public void lastName(String lastName){

			this.lastName = lastName;
		}
	public String getLastname(){

		return lastName;
	}

		public String birthDate(){

			//System.out.printf(" birthDate is %d/%d/%d%n:", birthDay, birthMonth,birthYear);
				return birthDay + "/" + birthMonth + "/" + birthYear;
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
}
