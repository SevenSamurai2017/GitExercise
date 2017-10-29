package is.ru.TicTacToe;

import is.ru.TicTacToe.exceptions.*;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BoardTest {

	@Test
	public void initTest() throws AlreadyOccupiedException,
                                  BoundaryException ,
                                  IllegalSymbolException {
		Board b = new Board();
		b.set(0, 0, 'O');
		b.init();
		assertEquals(' ', b.get(0, 0));
	}

	@Test(expected = IllegalSymbolException.class)
	public void setTest1() throws AlreadyOccupiedException,
                                  BoundaryException ,
                                  IllegalSymbolException {
		Board b = new Board();
		b.set(2, 2, 'P');
	}

	@Test(expected = AlreadyOccupiedException.class)
	public void setTest2() throws AlreadyOccupiedException,
                                  BoundaryException ,
                                  IllegalSymbolException {
		Board b = new Board();
		b.set(2, 2, 'X');
		b.set(2, 2, 'O');
	}

	@Test
	public void getTest1() throws AlreadyOccupiedException,
                                  BoundaryException ,
                                  IllegalSymbolException {
		Board b = new Board();
		b.set(0, 0, 'O');
		assertEquals('O', b.get(0, 0));
	}
}
