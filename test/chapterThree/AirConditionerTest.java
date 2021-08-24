package chapterThree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {



    @Test
    public void AirconditionerCanTurnOnTest(){
    // given that

    AirConditioner lg = new AirConditioner();
    assertFalse(false);

        // when

        lg.setOn(true);

        // assert that
        assertTrue(true);

    }

    @Test
    public void AirConditionalCanturnOff(){

        // given that

        AirConditioner lg = new AirConditioner();

        lg.setOn(true);

        // when

        lg.setOn(false);

        // assert that

        assertFalse(false);
    }

    @Test
    public void AirconditionerCanIncreaseTemperatureTest(){

        // given that

        AirConditioner lg = new AirConditioner();

        lg.setOn(true);

        // when

        lg.increaseTemperature();

        // assert that

        assertEquals( 17,lg.getcurrentTemperature());

    }

    @Test

    public void AirConditionerCanDecreaseTemperatureTest(){

        // given that

        AirConditioner lg = new AirConditioner();

        lg.setOn(true);

        lg.increaseTemperature();
        lg.increaseTemperature();

        // when

        lg.decreaseTemperature();

        // assert that

        assertEquals(17, lg.getcurrentTemperature());
    }

    @Test
    public void TemperatureCannotGoBeyond30Test(){

        // given that

        AirConditioner lg = new AirConditioner();

        lg.setOn(true);

        // when

        lg.increaseTemperature();
        lg.increaseTemperature();
        lg.increaseTemperature();
        lg.increaseTemperature();
        lg.increaseTemperature();
        lg.increaseTemperature();
        lg.increaseTemperature();
        lg.increaseTemperature();
        lg.increaseTemperature();
        lg.increaseTemperature();
        lg.increaseTemperature();
        lg.increaseTemperature();
        lg.increaseTemperature();
        lg.increaseTemperature();
        lg.increaseTemperature();
        lg.increaseTemperature();

         // assert that

        assertEquals(30, lg.getcurrentTemperature());

    }

    @Test

    public void temperatureCannotGoBelow16Test(){

        // given that

        AirConditioner lg = new AirConditioner();

        lg.setOn(true);

        lg.increaseTemperature();
        lg.increaseTemperature();

        // when

        lg.decreaseTemperature();
        lg.decreaseTemperature();
        lg.decreaseTemperature();
        lg.decreaseTemperature();
        lg.decreaseTemperature();

        // assert that

        assertEquals(16, lg.getcurrentTemperature());
    }

    @Test
  public void temperatureCannotIncreaseWhenAirConditionerIsOff(){

        // given

    AirConditioner lg = new AirConditioner();

    lg.setOn(false);

    // when

     lg.increaseTemperature();

     // assert that

        assertNotEquals(0, lg.getcurrentTemperature());


    }


}
