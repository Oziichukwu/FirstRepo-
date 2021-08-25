package chapterThree11;

public class HeartRate {

    private String firstName;

    private String lastName;

    private int birthMonth;

    private int birthDay;

    private int birthYear;


    public HeartRate(String firstName, String lastName, int birthMonth, int birthDay, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.birthYear = birthYear;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }


    public int getAge() {

        int age = 2021 - birthYear;

        return age;
    }

    public int maximumHeartRate() {

        int maximumHeartRate = 220 - getAge();

        return maximumHeartRate;
    }

    public int targetHeartRate(){

        int targetHeartRate =  (60 * maximumHeartRate() )  / 100;

        return targetHeartRate;
    }

}
