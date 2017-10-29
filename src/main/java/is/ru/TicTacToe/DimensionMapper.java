package is.ru.TicTacToe;

/**
* Changes int values from webserver to coordinates for the board.
*/
public final class DimensionMapper {

    private DimensionMapper(){}

    public static Coordinates getCoordinate(int val){
        return new Coordinates(val / 3, val % 3);
    }
}
