package chapterSeven.tutleGraphics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TurtleTest {
    Pen pen;
    Turtle myTurtle;
    @BeforeEach
    public void setUp(){
        myTurtle = new Turtle();
         pen = myTurtle.getPen();
    }

    @Test
    public void testThatTurtleHasAPenTest(){
        // given that
        Turtle myTurtle = new Turtle();
        // when
        Pen pen = myTurtle.getPen();
        // assertion
        assertNotNull(pen);
    }
    @Test
    public void testThatPenIsUpByDefault(){

        assertSame(PenPosition.UP, pen.getPosition());
    }

    @Test
    public void testThatTurtleCanMovePenDown(){
        Turtle myTurtle = new Turtle();
        Pen pen = myTurtle.getPen();
        assertSame(PenPosition.UP, pen.getPosition());
        //when
        myTurtle.penDown();
        //assert
        assertSame(PenPosition.DOWN, myTurtle.getPen().getPosition());
    }

    @Test
    public void testThatTurtleCanMovePenUP(){
        Turtle myTurtle = new Turtle();
        Pen pen = myTurtle.getPen();
        myTurtle.penDown();
        assertSame(PenPosition.DOWN, myTurtle.getPen().getPosition());
        //when
        myTurtle.penUP();
        //assert
        assertSame(PenPosition.UP, myTurtle.getPen().getPosition());
    }
}
