package practiseExercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SevenDisplayTest {
    SevenDisplay sevenDisplay;
    int[][] screen;

    @BeforeEach
    public void setUp() {
        sevenDisplay = new SevenDisplay();
        screen = new int[5][4];
        screen = sevenDisplay.getScreen();
    }

    @Test
    public void clearScreen() {

        SevenDisplay sevenDisplay = new SevenDisplay();

        sevenDisplay.clearScreen();

        int[][] emptyScreen = new int[5][4];

        assertArrayEquals(emptyScreen, sevenDisplay.getScreen());

    }

    @Test
    public void writeOnATest() {

        sevenDisplay.writeOnA();
        assertEquals(1, screen[0][0]);
        assertEquals(1, screen[0][1]);
        assertEquals(1, screen[0][2]);
        assertEquals(1, screen[0][3]);
    }

    @Test
    public void writeOnBTest() {

        sevenDisplay.writeOnB();
        assertEquals(1, screen[0][3]);
        assertEquals(1, screen[1][3]);
        assertEquals(1, screen[2][3]);
    }

    @Test
    public void writeOnCTest() {
        sevenDisplay.writeOnC();
        assertEquals(1, screen[2][3]);
        assertEquals(1, screen[3][3]);
        assertEquals(1, screen[4][3]);
    }

    @Test
    public void writeOnDTest() {
        sevenDisplay.writeOnD();
        for (int i = 0; i < 4; i++) assertEquals(1, screen[4][i]);
    }

    @Test
    public void writeOnETest() {
        sevenDisplay.writeOnE();
        for (int i = 2; i < 5; i++) assertEquals(1, screen[i][0]);
    }

    @Test
    public void writeOnFTest() {
        sevenDisplay.writeOnF();
        for (int i = 0; i < 3; i++) assertEquals(1, screen[i][0]);
    }

    @Test
    public void writeOnGTest() {
        sevenDisplay.writeOnG();
        for (int i = 0; i < 4; i++) assertEquals(1, screen[2][i]);
    }

    @Test
    public void displayTest() {
        sevenDisplay.writeOnA();
        sevenDisplay.writeOnB();
        sevenDisplay.writeOnC();
        sevenDisplay.writeOnD();
        sevenDisplay.writeOnE();
        sevenDisplay.writeOnF();
        sevenDisplay.writeOnG();
        sevenDisplay.display();
    }

    @Test
    public void aTest() {
        sevenDisplay.setScreen("10000001");
        for (int i = 0; i < 4; i++) {
            assertEquals(1, screen[0][i]);
        }
    }

    @Test
    public void bTest() {
        sevenDisplay.setScreen("01000001");
        for (int i = 0; i < 3; i++) {
            assertEquals(1, screen[i][3]);

        }
    }

    @Test
    public void cTest() {
        sevenDisplay.setScreen("00100001");
        for (int i = 2; i < 5; i++) {
            assertEquals(1, screen[i][3]);
        }
    }

    @Test
    public void dTest() {
        sevenDisplay.setScreen("00010001");
        for (int i = 0; i < 4; i++) {
            assertEquals(1, screen[4][i]);
        }
    }

    @Test
    public void eTest() {
        sevenDisplay.setScreen("00001001");
        for (int i = 2; i < 5; i++) {
            assertEquals(1, screen[i][0]);
        }
    }

    @Test
    public void fTest() {
        sevenDisplay.setScreen("00000101");
        for (int i = 0; i < 3; i++) {
            assertEquals(1, screen[i][0]);
        }
    }

    @Test
    public void gTest() {
        sevenDisplay.setScreen("00000011");
        for (int i = 0; i < 4; i++) {
            assertEquals(1, screen[2][i]);
        }
    }

    @Test
    public void Test8() {
        sevenDisplay.setScreen("11111111");
        sevenDisplay.display();
    }

    @Test
    public void testThereCanOnlyBeEightDigits() {
        assertThrows(IllegalArgumentException.class, () -> sevenDisplay.setScreen("111110111"));
    }

    @Test
    public void testThatThereCanOnlyBeBinaryDigits() {
        assertThrows(IllegalArgumentException.class, () -> sevenDisplay.setScreen("12110111"));
    }

    @Test
    public void testThatTheLastDigitAtZeroTurnsOffDisplay() {
        sevenDisplay.setScreen("11111110");
        for (int i = 2; i < 5; i++) {
            assertEquals(0, screen[i][3]);
        }
    }
    @Test
    public void testThatLessThanEightDigitHasTrailingZero(){
        sevenDisplay.setScreen("1111");
        for (int i = 1; i < 4; i++) {
            assertEquals(0,screen[0][1]);
        }
    }
}