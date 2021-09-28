package chapterSeven.tutleGraphics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
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

    @Test
    @DisplayName("Turtle can turn right while facing east test")
    public void testThatTurtleCanTurnRightOne(){
        //given that
        assertSame(Direction.EAST, myTurtle.getCurrentDirection());
        //when
        myTurtle.turnRight();
        // assert
        assertSame(Direction.SOUTH, myTurtle.getCurrentDirection());
    }

    @Test
    @DisplayName("Turtle can turn right while facing south")
    public void testThatTurtleCanTurnRightTwo(){
        // given that
        myTurtle.turnRight();
        assertSame(Direction.SOUTH, myTurtle.getCurrentDirection());
        // when
        myTurtle.turnRight();
        //assert
        assertSame(Direction.WEST, myTurtle.getCurrentDirection());
    }

    @Test
    @DisplayName("Turtle can turn right while facing west")
    public void testThatTurtleCanTurnRightThree(){
        // given that
        myTurtle.turnRight();
        myTurtle.turnRight();
        assertSame(Direction.WEST, myTurtle.getCurrentDirection());
        // when
        myTurtle.turnRight();
        assertSame(Direction.NORTH, myTurtle.getCurrentDirection());

    }

    @Test
    @DisplayName("Turtle can turn right while facing north")
    public void testThatTurtleCanTurnRightFour(){
        // given that
        myTurtle.turnRight();
        myTurtle.turnRight();
        myTurtle.turnRight();
        assertSame(Direction.NORTH, myTurtle.getCurrentDirection());
        // when
        myTurtle.turnRight();
        assertSame(Direction.EAST, myTurtle.getCurrentDirection());
    }
    @Test
    @DisplayName("Turtle can turn left while facing east")
    public void testThatTurtleCanTurnLeftOne(){
        //given that
        assertSame(Direction.EAST, myTurtle.getCurrentDirection());
        //when
        myTurtle.turnLeft();
        // assert
        assertSame(Direction.NORTH, myTurtle.getCurrentDirection());
    }

    @Test
    @DisplayName("Turtle can turn right while facing south")
    public void testThatTurtleCanTurnLeftTwo(){
        // given that
        myTurtle.turnLeft();
        assertSame(Direction.NORTH, myTurtle.getCurrentDirection());
        // when
        myTurtle.turnLeft();
        //assert
        assertSame(Direction.WEST, myTurtle.getCurrentDirection());

    }


    @Test
    @DisplayName("Turtle can turn right while facing west")
    public void testThatTurtleCanTurnLeftThree(){
        // given that
        myTurtle.turnLeft();
        myTurtle.turnLeft();
        assertSame(Direction.WEST, myTurtle.getCurrentDirection());
        // when
        myTurtle.turnLeft();
        assertSame(Direction.SOUTH, myTurtle.getCurrentDirection());

    }

    @Test
    @DisplayName("Turtle can turn right while facing north")
    public void testThatTurtleCanTurnLeftFour(){
        // given that
        myTurtle.turnLeft();
        myTurtle.turnLeft();
        myTurtle.turnLeft();
        assertSame(Direction.SOUTH, myTurtle.getCurrentDirection());
        // when
        myTurtle.turnLeft();
        assertSame(Direction.EAST, myTurtle.getCurrentDirection());
    }

    @Test
    @DisplayName("Turtle can move forward while facing east")
    public void testThatTurtleCanMoveForwardWhileFacingEast(){
        // given that
        assertSame(Direction.EAST, myTurtle.getCurrentDirection());
        assertEquals(new Position(0,0), myTurtle.getCurrentPosition());

        myTurtle.moveForward(5);

        assertEquals(new Position(0,4), myTurtle.getCurrentPosition());
    }


    @Test
    @DisplayName("Turtle can move forward while facing south")
    public void testThatTurtleCanMoveForwardWhileFacingSouth(){
        // given that
        myTurtle.turnRight();
        assertSame(Direction.SOUTH, myTurtle.getCurrentDirection());

       assertEquals(new Position(0,0), myTurtle.getCurrentPosition());

        myTurtle.moveForward(5);

        assertEquals(new Position(4,0), myTurtle.getCurrentPosition());
    }

    @Test
    @DisplayName("Turtle can move forward while facing west")
    public void testThatTurtleCanMoveForwardWhileFacingWest(){
        // given that
        myTurtle.turnRight();
        myTurtle.turnRight();

        assertSame(Direction.WEST, myTurtle.getCurrentDirection());

        assertEquals(new Position(0,0), myTurtle.getCurrentPosition());

        myTurtle.moveForward(5);

        assertEquals(new Position(0,-4), myTurtle.getCurrentPosition());
    }


    @Test
    @DisplayName("Turtle can move forward while facing north")
    public void testThatTurtleCanMoveForwardWhileFacingNorth(){
        // given that
        myTurtle.turnRight();
        myTurtle.turnRight();
        myTurtle.turnRight();

        assertSame(Direction.NORTH, myTurtle.getCurrentDirection());

        assertEquals(new Position(0,0), myTurtle.getCurrentPosition());

        myTurtle.moveForward(5);

        assertEquals(new Position(-4,0), myTurtle.getCurrentPosition());
    }



    @Test
    @DisplayName("Turtle can move on sketch pad test")
    public void turtleCanMoveOnSketchPadWhenFacingEastTest(){
        myTurtle.penDown();
        assertSame(Direction.EAST, myTurtle.getCurrentDirection());
        SketchPad sketchPad = new SketchPad(5,5);

        myTurtle.writeOn(sketchPad, 3);

        // assert
        int [][] floor = sketchPad.getFloor();
        assertEquals(1, floor[0][0]);
        assertEquals(1, floor[0][1]);
        assertEquals(1, floor[0][2]);
        assertEquals(0, sketchPad.getFloor()[0][3]);
        assertEquals(new Position(0,2), myTurtle.getCurrentPosition());

        //sketchPad.displayFloor();
    }


    @Test
    @DisplayName("Turtle can move on sketch pad test")
    public void turtleCanMoveOnSketchPadWhenFacingSouthFromStartTest(){
        myTurtle.penDown();
        myTurtle.turnRight();
        assertSame(Direction.SOUTH, myTurtle.getCurrentDirection());
        SketchPad sketchPad = new SketchPad(5,5);

        myTurtle.writeOn(sketchPad, 3);
        int [][] floor = sketchPad.getFloor();

        // assert
        for (int i = 0; i < 3; i++) {
            assertEquals(1, floor[i][0]);
        }
        assertEquals(0, sketchPad.getFloor()[3][0]);
        assertEquals(new Position(2,0), myTurtle.getCurrentPosition());

        //sketchPad.displayFloor();
    }
// this method needs working on
    @Test
    @DisplayName("Turtle can move on sketch pad test")
    public void turtleCanMoveOnSketchPadWhenFacingNorthFromStartTest() {
        SketchPad sketchPad = new SketchPad(5, 5);
        myTurtle.penUP();
        myTurtle.turnRight();
        myTurtle.writeOn(sketchPad, 3);
        assertSame(Direction.SOUTH, myTurtle.getCurrentDirection());

        int[][] floor = sketchPad.getFloor();
        for (int i = 0; i < 3; i++) {
            assertEquals(0, floor[i][0]);
        }
        assertEquals(new Position(2, 0), myTurtle.getCurrentPosition());

        myTurtle.turnRight();
        myTurtle.turnRight();
        assertSame(Direction.NORTH, myTurtle.getCurrentDirection());
        myTurtle.penDown();
        myTurtle.writeOn(sketchPad, 3);

        for (int i = 0; i < 3; i++) {
            assertEquals(1, floor[i][0]);
        }
        assertEquals(0, sketchPad.getFloor()[3][0]);

        assertEquals(new Position(0, 0), myTurtle.getCurrentPosition());

    }


    @Test
    @DisplayName("Turtle can move on sketch pad test")
    public void turtleCanMoveOnSketchPadWhenFacingSouthTest(){
        SketchPad sketchPad = new SketchPad(5,5);
        myTurtle.penDown();
        myTurtle.writeOn(sketchPad,3);

        // when
        myTurtle.turnRight();
        assertSame(Direction.SOUTH, myTurtle.getCurrentDirection());
        myTurtle.writeOn(sketchPad,3);

        //assert
        int [][] floor = sketchPad.getFloor();
        assertEquals(1, floor[0][2]);
        assertEquals(1, floor[1][2]);
        assertEquals(1, floor[2][2]);
        assertEquals(0, sketchPad.getFloor()[3][2]);
        assertEquals(new Position(2,2), myTurtle.getCurrentPosition());

        //sketchPad.displayFloor();

    }
    @Test
    @DisplayName("Turtle can move on sketch pad test")
    public void turtleCanMoveOnSketchPadWhenFacingWestTest(){
        SketchPad sketchPad = new SketchPad(5,5);
        myTurtle.penDown();
        myTurtle.writeOn(sketchPad,3);

        myTurtle.turnRight();
        myTurtle.writeOn(sketchPad,3);

        //when
        myTurtle.turnRight();
        assertSame(Direction.WEST, myTurtle.getCurrentDirection());
        myTurtle.writeOn(sketchPad,3);

        //assert
        int [][] floor = sketchPad.getFloor();
        assertEquals(1, floor[2][0]);
        assertEquals(1, floor[2][1]);
        assertEquals(1, floor[2][2]);
        //assertEquals(0, sketchPad.getFloor()[2][3]);
        assertEquals(new Position(2,0), myTurtle.getCurrentPosition());

        //sketchPad.displayFloor();
    }


    @Test
    @DisplayName("Turtle can move on sketch pad test")
    public void turtleCanMoveOnSketchPadWhenFacingNorthTest() {
        SketchPad sketchPad = new SketchPad(5,5);

        myTurtle.penDown();
        myTurtle.writeOn(sketchPad,3);

        myTurtle.turnRight();
        myTurtle.writeOn(sketchPad,3);


        myTurtle.turnRight();
        myTurtle.writeOn(sketchPad,3);

        // when
        myTurtle.turnRight();
        assertSame(Direction.NORTH, myTurtle.getCurrentDirection());
        myTurtle.writeOn(sketchPad,3);

        //assert
        int[][] floor = sketchPad.getFloor();
        assertEquals(1, floor[0][0]);
        assertEquals(1, floor[1][0]);
        assertEquals(1, floor[2][0]);
        //assertEquals(0, sketchPad.getFloor()[3][0]);
        assertEquals(new Position(0, 0), myTurtle.getCurrentPosition());

        //sketchPad.displayFloor();

    }

    @Test
    @DisplayName("Turtle can display on sketchPad test")
    public void turtleCanDisplayOnSketchPadTest(){

        SketchPad sketchPad = new SketchPad(10,10);
        myTurtle.penDown();
        myTurtle.writeOn(sketchPad,5);

        myTurtle.turnRight();
        myTurtle.writeOn(sketchPad,5);

        myTurtle.turnRight();
        myTurtle.writeOn(sketchPad,5);

        myTurtle.turnRight();
        myTurtle.writeOn(sketchPad,5);

        sketchPad.displayFloor();
    }
}
