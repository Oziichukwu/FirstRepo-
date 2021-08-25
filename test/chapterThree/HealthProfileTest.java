import chapterThree11.BMI;
import chapterThree11.HealthProfile;
import chapterThree11.HeartRate;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HealthProfileTest {

    HealthProfile myHealthProfile;

    HeartRate myHeartRate;

    BMI myBMI;

    @BeforeEach

    public void setup(){

        myHealthProfile = new HealthProfile("male");

        myHeartRate = new HeartRate("Segun", "Olusegun", 06, 11, 1900);

        myBMI = new BMI(25 , 70);

    }

    @AfterEach

    public void teardown(){

    }

    @Test

    public void testToCalculateAge(){

        myHeartRate.setBirthYear(1993);

        assertEquals(28, myHeartRate.getAge());
    }

    @Test
    public void healthProfileCanCalculateBMITest(){

        myBMI.setHeight(15);

        myBMI.setWeight(80);

        myBMI.setBMI();

        assertEquals(249, myBMI.getBMI());
    }

    @Test

    public void healthProfileCanCalculateMaximumHeartRateTest(){

        myHeartRate.setBirthYear(1993);

        assertEquals(192, myHeartRate.maximumHeartRate());
    }

    @Test

    public void healthProfileCanCalculateTargetHearthRateTest(){

        myHeartRate.setBirthYear(1993);

        assertEquals(115, myHeartRate.targetHeartRate());

    }

    @Test

    public void healthProfileCanDisplayGenderTest(){

        myHealthProfile.setGender("male");

        assertEquals("male", myHealthProfile.getGender());

    }



}
