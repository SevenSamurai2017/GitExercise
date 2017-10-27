package is.ru.TicTacToe;

import is.ru.TicTacToe.exceptions.*;

public final class BoundryChecker {
    private BoundryChecker() {};

    public static void checkBoundry(int row, int col) throws BoundaryException{
        checkBoundry(row);
        checkBoundry(col);
    }
    private static void checkBoundry(int value) throws BoundaryException {
        if(value < 0 || value > 2){
            throw new BoundaryException();
        }
    }
}
