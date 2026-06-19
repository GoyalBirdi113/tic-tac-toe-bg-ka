package tictactoe;

public class Board {

    private char[][] cells;

    public Board() {
        cells = new char[3][3];

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                cells[i][j] = '-';
            }
        }
    }
}