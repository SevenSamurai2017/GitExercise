package is.ru.TicTacToe;

public final class DimensionMapper {

    private DimensionMapper(){}

    public static Coordinates getCoordinate(int val){
        return new Coordinates(val / 3, val % 3);
    }
}
