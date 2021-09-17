package chapter_Eight;

public class Time1 {

    private int hour;
    private int minute;
    private int second;

    public static void main(String[] args) {

        Time1 myTime = new Time1();
        try {
            myTime.setTime(2,45,21);
        }
        catch (IllegalArgumentException e){
            System.out.printf("Exception: %s%n", e.getMessage());
        }
        displayTime("the time still didnt change", myTime);
    }

    private static void displayTime(String head, Time1 mytime) {

        System.out.printf("%s%nUniversal time: %s%nStandardTime: %s%n",
                head, mytime.universalTimeDisplay(), mytime.standardTimeDisplay());
    }

    public void setTime(int hour, int minute, int second){

        if( hour < 0 || hour > 24 ){
            throw new IllegalArgumentException("Hour was out of range(input must be in the range of 0-24)");
        }else
            if(minute < 0 || minute > 60){
                throw new IllegalArgumentException("minute is out of range(input must be in the range of 0-60)");
            }else
                if(second < 0 || second > 60){
                    throw new IllegalArgumentException("second is out of range(input must be in the range of 0-60)");
                }
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String universalTimeDisplay(){

        return String.format("%02d:%02d:%02d",hour, minute,second);
    }
    public String standardTimeDisplay(){
        if(hour == 0 || hour == 12){
            return String.format("%d:%02d:%02d %s", 12, minute,second,
                    (hour<12?"AM":"PM"));
        }else
            return String.format("%d:%02d:%02d %s", hour % 12, minute,second,
                    (hour<12?"AM":"PM"));
    }
}

