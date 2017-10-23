package is.ru.TicTacToe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PlayerTest {

	@Test
	public void getNameTest() {
		Player P1 = new Player("Manni", 'X');
		assertEquals("Manni", P1.getName());
	}
	@Test
	public void getNumberOfWinsTest() {
		Player P1 = new Player("Manni", 'X');
		assertEquals(0, P1.getNumberOfWins());
	}
	@Test
	public void playerWonTest() {
		Player P1 = new Player("Manni", 'X');
		P1.playerWon();
		assertEquals(1, P1.getNumberOfWins());
	}
	@Test
	public void multipleWinsTest() {
		Player P1 = new Player("Manni", 'X');
		P1.playerWon();
		P1.playerWon();
		P1.playerWon();
		P1.playerWon();
		P1.playerWon();

		assertEquals(5, P1.getNumberOfWins());
	}
}