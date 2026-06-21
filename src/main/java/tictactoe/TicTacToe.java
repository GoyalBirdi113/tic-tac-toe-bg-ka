package tictactoe;

public class TicTacToe {

    private char currentPlayer;
    private Board board;

    public TicTacToe() {
        this.currentPlayer = 'X';
        this.board = new Board();
    }

    public boolean makeMove(int row, int col) {
        if (board.isCellEmpty(row, col)) {
            board.place(row, col, currentPlayer);
            return true;
        }
        return false;
    }

    public void switchCurrentPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }

    public boolean isGameOver() {
        return board.isFull();
    }

    public void printBoard() {
        board.print();
    }

    public char getCurrentPlayer() {
        return currentPlayer;
    }

    public char[][] getBoard() {
        return board.getCells();
    }

    public void restart() {
        board.reset();
        currentPlayer = 'X';
    }
}