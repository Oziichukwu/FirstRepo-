package ticTakToeGame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TicTakToeTest {
    @Test
    void testThatTicTacToeHasABoard(){
        TicTacToe tikky = new TicTacToe();
        assertArrayEquals(new char[][]{{'#', '#', '#'}, {'#', '#', '#'}, {'#', '#', '#'}},tikky.getBoard());
    }

    @Test
    void testThatTicTacToeBoardIsEmptyByDefault(){
        TicTacToe tikky = new TicTacToe();
        assertArrayEquals(new char[][]{{'#', '#', '#'}, {'#', '#', '#'}, {'#', '#', '#'}},tikky.getBoard());
    }

    @Test
    void testThatTicTacToeHas2PlayersTest(){
        TicTacToe tikky = new TicTacToe();
        //BoardPosition boardPosition = null;

        tikky.setPlayer1(BoardPosition.X);
        tikky.setPlayer2(BoardPosition.O);
        assertEquals("X", tikky.getPlayer1().toString());
        assertEquals("O", tikky.getPlayer2().toString());
    }

    @Test
    void player1CanMoveTest(){

        TicTacToe tikky = new TicTacToe();
        tikky.setPlayer1(BoardPosition.X);
        tikky.setPlayer2(BoardPosition.O);
        tikky.player1move();
        assertArrayEquals(new char[][]{{'#', '#', '#'}, {'#', 'X', '#'}, {'#', '#', '#'}}, tikky.getBoard());


    }

}
