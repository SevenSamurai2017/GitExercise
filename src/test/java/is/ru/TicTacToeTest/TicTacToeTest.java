package is.ru.TicTacToe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TicTacToeTest {
	
	@Test
    public void testChangePlayer(){
        TicTacToe tic = new TicTacToe();
        tic.changePlayer();
        assertEquals('O', tic.getCurrentPlayer().marker);
    }
    @Test
    public void testConstructor(){
        TicTacToe tic = new TicTacToe("Manni", "Hassi");
        assertEquals("Manni", tic.getPlayer1().name);
    }

    @Test
    public void testHorizontalWin(){
        TicTacToe tic = new TicTacToe();
        tic.b.board[0][0] = 'X';
        tic.b.board[2][1] = 'O';
        tic.b.board[0][1] = 'X';
        tic.b.board[2][2] = 'O';
        tic.b.board[0][2] = 'X';
        assertEquals(true, tic.checkForWin());
    }

    @Test
    public void testVerticalWin(){
        TicTacToe tic = new TicTacToe();
        tic.b.board[0][0] = 'X';
        tic.b.board[2][1] = 'O';
        tic.b.board[1][0] = 'X';
        tic.b.board[2][2] = 'O';
        tic.b.board[2][0] = 'X';
        assertEquals(true, tic.checkForWin());
    }

    @Test
    public void testDiagonalWin(){
        TicTacToe tic = new TicTacToe();
        tic.b.board[0][0] = 'X';
        tic.b.board[2][1] = 'O';
        tic.b.board[1][1] = 'X';
        tic.b.board[2][0] = 'O';
        tic.b.board[2][2] = 'X';
        assertEquals(true, tic.checkForWin());
    }
}