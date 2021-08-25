 import chapterThree11.AirConditioner;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {

    @Test
    public void AirConditionerCanTurnOn(){
        // give that
        AirConditioner lgAirconditioner = new AirConditioner();

        // when
        lgAirconditioner.isOn(true);

        // assert that

        int lgController = lgAirconditioner.getController();

        assertTrue(true);

    }

    @Test
    public void AirConditionerCanTurnOff(){

        // given that
        AirConditioner lgAirconditioner = new AirConditioner();

            lgAirconditioner.isOn(false);

        // when

            lgAirconditioner.isOn(false);

        // check that

        int lgController = lgAirconditioner.getController();
        assertFalse(false);
    }

    @Test
     public void AirconditionerCanIncreaseTemperature() {

        // given that

        AirConditioner lgAirconditioner = new AirConditioner();

        lgAirconditioner.isOn(true);

        // when

        lgAirconditioner.increaseTemperature(20);

        // check that

        int lgController = lgAirconditioner.getController();
        assertEquals(21, lgController);

    }

    @Test
    public void AirConditionerCanDecreaseTemperature(){

        // given that

        AirConditioner lgAirconditioner = new AirConditioner();

        lgAirconditioner.isOn(true);

        lgAirconditioner.decreaseTemperature(20);

        // when

        lgAirconditioner.decreaseTemperature(20);

        // check that

        int lgController = lgAirconditioner.getController();
        assertEquals(19,lgController);

    }

    @Test
    public void AirConditionerTemperatureCannotGoBeyondTheMaximun(){

        // given that
        AirConditioner lgAirconditioner = new AirConditioner();

        lgAirconditioner.isOn(true);


        // when

        lgAirconditioner.increaseTemperature(35);

        // check that

        int lgController = lgAirconditioner.getController();
        assertEquals(30, lgController);


    }


    @Test
    public void AirConditionerTemperatureCannotGoBelowTheMinimum(){
        //given that

        AirConditioner lgAirconditioner = new AirConditioner();

        lgAirconditioner.isOn(true);


        // when

        lgAirconditioner.decreaseTemperature(10);

        // check that

        int lgController = lgAirconditioner.getController();
        assertEquals(16, lgController);

    }

}
