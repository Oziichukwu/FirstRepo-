import chapterThree11.AirConditiona;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AirConditionaTest {

    @Test
    public void airConditionaCanTurnOnTest(){

        // given that
        AirConditiona lg = new AirConditiona();

        // when

        lg.setOn(true);

        // assert that
        assertTrue(lg.getIson());
    }
    @Test
    public void airConditionaCanTurnOffTest(){

        // given that
        AirConditiona lg = new AirConditiona();
        lg.setOn(true);

        // when
        lg.setOn(false);

        // assert that
        assertFalse(lg.getIson());
    }
    @Test
    public void airConditionaCanIncreaseTemperatureTest(){

        // given that

        AirConditiona lg = new AirConditiona();
        lg.setOn(true);

        // when

        lg.increaseTemperature();

        // assert that

        assertEquals(17, lg.getTemperature());


    }
    @Test
    public void airConditionaCanDecreaseTemperatureTest(){

        // given that
        AirConditiona lg = new AirConditiona();
        lg.setOn(true);
        lg.increaseTemperature();
        lg.increaseTemperature();
        lg.increaseTemperature();
        lg.increaseTemperature();

        // when
        lg.decreaseTemperature();

        // assert that
        assertEquals(19, lg.getTemperature());

    }

    @Test
    public void airConditionaCannotIncreaseTemperatureBeyond30Test(){

        // given that

        AirConditiona lg = new AirConditiona();
        lg.setOn(true);

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

         // when

                lg.increaseTemperature();
                lg.increaseTemperature();

         // assert that

        assertEquals(30, lg.getTemperature());
    }
    @Test
    public void airConditionaCannotGoBelow16Test(){

        // given that

        AirConditiona lg = new AirConditiona();
        lg.setOn(true);
        lg.increaseTemperature();

        // when
        lg.decreaseTemperature();
        lg.decreaseTemperature();
        lg.decreaseTemperature();
        lg.decreaseTemperature();

        // assert that
        assertEquals(16, lg.getTemperature());

    }

}
