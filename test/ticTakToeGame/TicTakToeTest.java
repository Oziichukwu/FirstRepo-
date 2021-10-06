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
       // tikky.setPlayer2(BoardPosition.O);
        tikky.player1move(5);
        assertArrayEquals(new char[][]{{'#', '#', '#'}, {'#', 'X', '#'}, {'#', '#', '#'}}, tikky.getBoard());
    }

    @Test
    void player2CanMoveTest(){

        TicTacToe tikky = new TicTacToe();
        tikky.setPlayer1(BoardPosition.X);
        tikky.setPlayer2(BoardPosition.O);
        tikky.player1move(5);
        tikky.player2move(6);
        assertArrayEquals(new char[][]{{'#', '#', '#'}, {'#', 'X', 'O'}, {'#', '#', '#'}}, tikky.getBoard());
    }


    @Test
    void player1AndPlayerTwoCanMoveTest(){

        TicTacToe tikky = new TicTacToe();
        tikky.setPlayer1(BoardPosition.X);
        tikky.setPlayer2(BoardPosition.O);
        tikky.player1move(5);
        tikky.player2move(6);
        tikky.player1move(1);

        assertArrayEquals(new char[][]{{'X', '#', '#'}, {'#', 'X', 'O'}, {'#', '#', '#'}}, tikky.getBoard());
    }

    @Test
    void player1AndPlayerTwoCanMoveManyTest(){

        TicTacToe tikky = new TicTacToe();
        tikky.setPlayer1(BoardPosition.X);
        tikky.setPlayer2(BoardPosition.O);
        tikky.player1move(5);
        tikky.player2move(6);
        tikky.player1move(1);
        tikky.player2move(4);
        tikky.player1move(3);
        tikky.player2move(2);
        tikky.player1move(7);
        tikky.player2move(9);
        tikky.player1move(8);

        assertArrayEquals(new char[][]{{'X', 'O', 'X'}, {'O', 'X', 'O'}, {'X', 'X', 'O'}}, tikky.getBoard());
    }

}
