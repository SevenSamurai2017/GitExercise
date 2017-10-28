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
	public void getMarkerTest(){
		Player P1 = new Player("Manni", 'X');
		assertEquals('X', P1.getMarker());	
	}

}