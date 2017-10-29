package is.ru.TicTacToe;

import is.ru.TicTacToe.Game_domain.*;
import is.ru.TicTacToe.Game_logic.*;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CoordinatesTest {

	@Test
	public void getColumnTest(){
		Coordinates c = new Coordinates(1, 2);
		assertEquals(2, c.getColumn()); 
	}

	@Test
	public void getRowTest(){
		Coordinates c = new Coordinates(1, 2);
		assertEquals(1, c.getRow()); 
	}
}