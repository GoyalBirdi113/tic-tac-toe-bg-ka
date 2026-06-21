package tictactoe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TicTacToeTest {

    @Test
    void gameStartsWithPlayerX() {
        TicTacToe game = new TicTacToe();

        assertEquals('X', game.getCurrentPlayer());
    }

    @Test
    void switchPlayerChangesXToO() {
        TicTacToe game = new TicTacToe();

        game.switchCurrentPlayer();

        assertEquals('O', game.getCurrentPlayer());
    }

    @Test
    void validMoveReturnsTrue() {
        TicTacToe game = new TicTacToe();

        assertTrue(game.makeMove(0, 0));
    }

    @Test
    void invalidMoveOnOccupiedCellReturnsFalse() {
        TicTacToe game = new TicTacToe();

        game.makeMove(0, 0);

        assertFalse(game.makeMove(0, 0));
    }

    @Test
    void newGameIsNotOver() {
        TicTacToe game = new TicTacToe();

        assertFalse(game.isGameOver());
    }
}