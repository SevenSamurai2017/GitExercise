package is.ru.TicTacToe.Game_logic;

import is.ru.TicTacToe.Game_domain.Coordinates;

public final class DimensionMapper {

    private DimensionMapper(){}

    public static Coordinates getCoordinate(int val){
        return new Coordinates(val / 3, val % 3);
    }
}
