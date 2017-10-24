package is.ru.TicTacToe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HumanTest {

	@Test
	public void getNameTest() {
		Human H1 = new Human("Hassi", 'X');
		assertEquals("Hassi", H1.getName());
	}
	@Test
	public void getNumberOfWinsTest() {
		Human H1 = new Human("Hassi", 'X');
		assertEquals(0, H1.getNumberOfWins());
	}
	@Test
	public void playerWonTest() {
		Human H1 = new Human("Hassi", 'X');
		H1.playerWon();
		assertEquals(1, H1.getNumberOfWins());
	}
}