package is.ru.TicTacToe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HumanTest {

	@Test
	public void getNameTest() {
		Human P1 = new Human("Manni", 'X');
		assertEquals("Manni", P1.getName());
	}
}