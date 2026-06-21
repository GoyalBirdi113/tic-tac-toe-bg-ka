package TicTacToe;

public class Board {

    private char[][] cells;

    public Board() {
        cells = new char[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                cells[i][j] = '-';
            }
        }
    }

    public boolean isCellEmpty(int row, int col) {
        return cells[row][col] == '-';
    }

    public void place(int row, int col, char marker) {
        cells[row][col] = marker;
    }

    public boolean isFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (cells[i][j] == '-') {
                    return false;
                }
            }
        }

        return true;
    }

    public void print() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(cells[i][j] + " ");
            }
            System.out.println();
        }
    }
}