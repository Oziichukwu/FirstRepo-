public class Date{

	private int month;

	private int day;

	private int year;

	public Date( int month, int day, int year){

			this.month = month;

			this.day = day;

			this.year = year;
	}


		public void setMonth(int month){

			this.month = month;
	}
		public int getmonth(){

		return month;
	}


		public void setDay(int day){
		
			this.day = day;
		
		}

		public int getday(){

		return day;
		}
		
		public void setYear(int year){

			this.year = year;
			}

		public int getyear(){

			return year;
		}

			public void displayDate(){
			

			System.out.printf(" The date is: %d/%d/%d", month,day,year);
			
	}

		//public int  getDisplaydate(){
			

				//return displayDate;
			
		//}

}