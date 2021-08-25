import chapterThree11.HeartRate;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HeartRateTest {

    HeartRate myHeartRate;

    @BeforeEach

    public void setup(){

        myHeartRate = new HeartRate("Segun", "Emmanuel" , 06, 11, 1900);
    }

    @AfterEach

    public void teardown(){

    }

    @Test

    public void testToGetFirstName(){

        myHeartRate.setFirstName("Tife");

        assertEquals("Tife", myHeartRate.getFirstName());
    }

    @Test

    public void testToGetLastname(){

        myHeartRate.setLastName("Olusegun");

        assertEquals("Olusegun", myHeartRate.getLastName());
    }

    @Test

    public void calculateAgeTest(){

        myHeartRate.setBirthYear(1993);

        assertEquals(28, myHeartRate.getAge());

            }

    @Test

    public void testToCalculateMaximumHeartRate(){

        myHeartRate.setBirthYear(1993);

      assertEquals(192, myHeartRate.maximumHeartRate());

    }

    @Test

    public void testToCalculateTargetHeartRate(){

        myHeartRate.setBirthYear(1994);

        assertEquals(115, myHeartRate.targetHeartRate());
    }

}
