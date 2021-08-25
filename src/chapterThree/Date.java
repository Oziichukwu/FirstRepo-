package chapterThree11;

public class Date {


    private int month;

    private int day;

    private int year;

    public Date(int month, int day, int year) {

        if ( month > 0 && month <= 12)
        this.month = month;

        if ( day > 0 && day <= 31)
        this.day = day;

        if ( year >= 1900 )
        this.year = year;
    }

    public int getMonth() {

        return month;
    }

    public void setMonth(int month) {

        if ( month > 0 && month <= 12)

            this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {

        if ( day > 0 && day <= 31) {
            this.day = day;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {

        if ( year >= 1900)
        this.year = year;
    }


    public String displayDate() {

        return month + "/" + day + "/" + year;
    }
}
