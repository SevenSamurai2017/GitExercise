package is.ru.TicTacToe;

public class Coordinates {

    private int column;
    private int row;

    public Coordinates(int row, int column){
        this.column = column;
        this.row = row;
    }

    public int getColumn() {
        return this.column;
    }

    public int getRow() {
        return this.row;
    }
}
