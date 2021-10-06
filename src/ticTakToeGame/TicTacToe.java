package ticTakToeGame;

public class TicTacToe {
    private TicTacToeBoard ticTacToeBoard = new TicTacToeBoard();
    private BoardPosition player1;
    private BoardPosition player2;
    private BoardPosition boardPosition;


    public char[][] getBoard() {

        return ticTacToeBoard.getBoard();
    }

    public void setPlayer1(BoardPosition x) {
        this.player1 = BoardPosition.X;
    }

    public void setPlayer2(BoardPosition o) {
        this.player2 = BoardPosition.O;
    }

    public BoardPosition getPlayer1() {
        return player1;
    }

    public BoardPosition getPlayer2() {
        return player2;
    }

    public void player1move(int position) {
        ticTacToeBoard.move(position,player1);
    }

    public void player2move(int position) {
        ticTacToeBoard.move(position,player2);
    }
}
