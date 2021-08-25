import chapterThree11.Date;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DateTest {

    Date myDate;

    @BeforeEach

    public void setup(){

        myDate = new Date(12, 31, 1900);

    }

    @AfterEach

    public void teardown(){

    }
    @Test

    public void dateCannotExceedThirtyOneDays(){

        myDate.setDay(32);

        assertEquals(31, myDate.getDay());
    }

    @Test

    public void monthCannotExceedTwelveTest(){

        myDate.setMonth(13);

        assertEquals(12, myDate.getMonth());
    }

    @Test

    public void yearCannotgoBelow1900Test(){

        myDate.setYear(1890);

        assertEquals(1900, myDate.getYear());
    }

    @Test

    public void DateCanDisplayMonthDayAndYear(){

        myDate.setDay(4);

        myDate.setMonth(5);

        myDate.setYear(2001);

        myDate.displayDate();

        assertEquals("5/4/2001", myDate.displayDate());
    }

}
