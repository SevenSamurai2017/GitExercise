package is.ru.TicTacToe.Game_domain;

import is.ru.TicTacToe.Game_exceptions.*;

/**
* Checks location is out of bounds
*/
public final class BoundaryChecker {
    private BoundaryChecker() {};

    public static void checkBoundary(int row, int col) throws BoundaryException{
        checkBoundary(row);
        checkBoundary(col);
    }

    private static void checkBoundary(int value) throws BoundaryException {
        if(value < 0 || value > 2){
            throw new BoundaryException();
        }
    }
}
