package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        TicTacToe game = new TicTacToe();
        Scanner scanner = new Scanner(System.in);

        while (!game.isGameOver()) {

            game.printBoard();

            System.out.println(
                    "Spieler "
                            + game.getCurrentPlayer()
                            + ", gib Reihe (0–2) und Spalte (0–2) ein:"
            );

            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (game.makeMove(row, col)) {
                game.switchCurrentPlayer();
            } else {
                System.out.println("Ungültiger Zug, versuche es erneut.");
            }
        }

        System.out.println("Spiel beendet!");
        game.printBoard();
    }
}