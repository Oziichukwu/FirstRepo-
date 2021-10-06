package ticTakToeGame;

public class TicTacToeBoard {

    private static char[][] ticTacToeBoard = null;
    public TicTacToeBoard() {
        ticTacToeBoard = new char[][]{{'#','#','#'},{'#','#','#'},{'#','#','#'}};
    }


    public char[][] getBoard() {
        return ticTacToeBoard;
    }

    public void move(int position, BoardPosition x) {

                if (position == 1) {
                    ticTacToeBoard[0][0] = 'O';
                    ticTacToeBoard[0][0] = 'X';
                }
                if (position == 2) {
                    ticTacToeBoard[0][1] = 'X';
                    ticTacToeBoard[0][1] = 'O';
                }
                if (position == 3) {
                    ticTacToeBoard[0][2] = 'O';
                    ticTacToeBoard[0][2] = 'X';
                }
                if (position == 4) {
                    ticTacToeBoard[1][0] = 'X';
                    ticTacToeBoard[1][0] = 'O';
                }

            if ( position == 5) {
                ticTacToeBoard[1][1] = 'O';
                ticTacToeBoard[1][1] = 'X';

                }
        if (position == 6) {
            ticTacToeBoard[1][2] = 'X';
            ticTacToeBoard[1][2] = 'O';
        }
        if (position == 7) {
            ticTacToeBoard[2][0] = 'O';
            ticTacToeBoard[2][0] = 'X';
        }
        if (position == 8) {
            ticTacToeBoard[2][1] = 'O';
            ticTacToeBoard[2][1] = 'X';
        }
        if (position== 9) {
            ticTacToeBoard[2][2] = 'X';
            ticTacToeBoard[2][2] = 'O';
        }

    }
}
