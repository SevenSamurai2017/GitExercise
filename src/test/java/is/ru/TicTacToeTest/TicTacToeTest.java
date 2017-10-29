package is.ru.TicTacToe;

import is.ru.TicTacToe.exceptions.*;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TicTacToeTest {
    
    @Test
    public void testChangePlayer(){
        TicTacToe tic = new TicTacToe();
        tic.changePlayer();
        assertEquals("Player2", tic.getCurrentPlayerName());
    }

    @Test
    public void makeMoveTest() throws AlreadyOccupiedException,
                                      BoundaryException ,
                                      IllegalSymbolException {
        TicTacToe tic = new TicTacToe();
        char marker = tic.makeMove(5);
        assertEquals('X', marker);
    }

    @Test(expected = AlreadyOccupiedException.class)
    public void makeMoveTest2() throws AlreadyOccupiedException,
                                      BoundaryException ,
                                      IllegalSymbolException {
        TicTacToe tic = new TicTacToe();
        tic.makeMove(5);
        tic.makeMove(5);
    }

    @Test(expected = BoundaryException.class)
    public void makeMoveTest3() throws AlreadyOccupiedException,
                                      BoundaryException ,
                                      IllegalSymbolException {
        TicTacToe tic = new TicTacToe();
        tic.makeMove(69);
    }


    @Test
    public void checkForWinnerHorizontalTest() throws AlreadyOccupiedException,
                                      BoundaryException ,
                                      IllegalSymbolException {
        TicTacToe tic = new TicTacToe();
        tic.makeMove(0);
        tic.makeMove(3);
        tic.makeMove(1);
        tic.makeMove(4);
        tic.makeMove(2);
        assertEquals(true, tic.checkForWinner());
    }

    @Test
    public void checkForWinnerFailTest() throws AlreadyOccupiedException,
                                      BoundaryException ,
                                      IllegalSymbolException {
        TicTacToe tic = new TicTacToe();
        tic.makeMove(0);
        tic.makeMove(3);
        assertEquals(false, tic.checkForWinner());
    }

    @Test
    public void checkForWinnerVerticalTest() throws AlreadyOccupiedException,
                                      BoundaryException ,
                                      IllegalSymbolException {
        TicTacToe tic = new TicTacToe();
        tic.makeMove(0);
        tic.makeMove(2);
        tic.makeMove(3);
        tic.makeMove(5);
        tic.makeMove(6);
        assertEquals(true, tic.checkForWinner());
    }

    @Test
    public void checkForWinnerDiagonalTest() throws AlreadyOccupiedException,
                                      BoundaryException ,
                                      IllegalSymbolException {
        TicTacToe tic = new TicTacToe();
        tic.makeMove(0);
        tic.makeMove(2);
        tic.makeMove(4);
        tic.makeMove(5);
        tic.makeMove(8);
        assertEquals(true, tic.checkForWinner());
    }

}