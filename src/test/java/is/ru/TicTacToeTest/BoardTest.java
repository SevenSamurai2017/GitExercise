package is.ru.TicTacToe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BoardTest {

	@Test
	public void fillBoardTest() {
		Board b = new Board();
		b.fillBoard();
		assertEquals('1', b.board[0][0]);
	}
	@Test
	public void checkVerticalTest() {
		Board b = new Board();
		b.board[0][0] = 'X';
		b.board[0][1] = 'X';
		b.board[0][2] = 'X';
		assertEquals('X', b.checkVertical());
	}
}