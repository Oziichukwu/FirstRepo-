package practiseExercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    Calculator goodboyzz;

    @BeforeEach
    void setUp() {
        goodboyzz = new Calculator();

    }

    @Test
    public void calculatorIsNotVoidTest() {

        Calculator goodboyzz = new Calculator();
        assertNotNull(goodboyzz);
    }

    @Test
    public void calculatorCanTurnOnTest() {

        goodboyzz.setOn(true);

        assertTrue(goodboyzz.getIsOn());
    }

    @Test
    public void calculatorCanTurnOffTest() {
        goodboyzz.setOn(true);

        goodboyzz.setOn(false);

        assertFalse(goodboyzz.getIsOn());
    }

    @Test
    public void calculatorCanPerformAdditionWhenIntegersArePassedTest() {

        goodboyzz.setOn(true);

        goodboyzz.setAddition(6, 4);

        assertEquals(10, goodboyzz.getAddition());
    }
    @Test
    public void calculatorCanPerformAdditionWhenFloatingPointValuesAreUsedTest(){
        goodboyzz.setOn(true);
        goodboyzz.setAddition(5.4,3.5);
        assertEquals(8.9, goodboyzz.getAddition());
    }
    @Test
    public void calculatorCanPerformAdditionWhenFloatingPointValuesAndIntegersAreUsedTest(){
        goodboyzz.setOn(true);
        goodboyzz.setAddition(5.4,3);
        assertEquals(8.4, goodboyzz.getAddition());
    }
    @Test
    public void calculatorCanPerformSubtractionWhenIntegersAreUsedTest(){
        goodboyzz.setOn(true);
        goodboyzz.setSubtraction(45,35);
        assertEquals(10, goodboyzz.getSubtraction());
    }
    @Test
    public void calculatorCanPerformSubtractionWhenFloatingPointsValuesAreUsedTest(){
        goodboyzz.setOn(true);
        goodboyzz.setSubtraction(4.5,3.5);
        assertEquals(1.0, goodboyzz.getSubtraction());
    }
    @Test
    public void calculatorCanPerformSubtractionWhenFloatingPointsValuesAndIntegersAreUsedTest(){
        goodboyzz.setOn(true);
        goodboyzz.setSubtraction(4.5,3);
        assertEquals(1.5, goodboyzz.getSubtraction());
    }
    @Test
    public void calculatorCanPerformMultiplicationWhenIntegersAreUsedTest(){
        goodboyzz.setOn(true);
        goodboyzz.setProduct(5,5);
        assertEquals(25, goodboyzz.getProduct());
    }
    @Test
    public void calculatorCanPerformMultiplicationWhenFloatingPointValuesAreUsedTest(){
        goodboyzz.setOn(true);
        goodboyzz.setProduct(5.1,5.2);
        assertEquals(26.52, goodboyzz.getProduct());
    }
    @Test
    public void calculatorCanPerformMultiplicationWhenFloatingPointValuesAndIntegersAreUsedTest(){
        goodboyzz.setOn(true);
        goodboyzz.setProduct(5.1,5);
        assertEquals(25.5, goodboyzz.getProduct());
    }
    @Test
    public void calculatorCanPerformDivisionWhenIntegersAreUsedTest(){
        goodboyzz.setOn(true);
        goodboyzz.setDivision(25, 5);
        assertEquals(5, goodboyzz.getQuotient());
    }
    @Test
    public void calculatorCanPerformDivisionWhenFloatingPointValuesAreUsedTest(){
        goodboyzz.setOn(true);
        goodboyzz.setDivision(25.2, 5.1);
        assertEquals(4.9411764705882355, goodboyzz.getQuotient());
    }
    @Test
    public void calculatorCanPerformSquareFunctionTest(){
        goodboyzz.setOn(true);
        goodboyzz.setSquare(8);
        assertEquals(64, goodboyzz.getSquare());
    }
    @Test
    public void calculatorCanPerformCubeFunctionTest(){
        goodboyzz.setOn(true);
        goodboyzz.setCube(5);
        assertEquals(125, goodboyzz.getCube());
    }
}