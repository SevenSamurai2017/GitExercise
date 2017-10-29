package is.ru.TicTacToe;

import is.ru.TicTacToe.exceptions.*;

/**
*
*
*/
public class TicTacToe {

    private Player player1, player2, currentPlayer;
    public Board board;
    private boolean isOver;

    /**
    *
    *
    */
    public TicTacToe(){
        board = new Board();
        player1 = new Player("Player1", PlayerSymbol.X);
        player2 = new Player("Player2", PlayerSymbol.O);
        currentPlayer = player1;
        isOver = false;
    }

    /**
    * Changes current player
    */
    public void changePlayer(){
        currentPlayer = currentPlayer == player1 ? player2 : player1;
    }

    /**
    * Marks move if game is not over
    * @param move selected location for marker
    * <return> returns marker
    */
    public char makeMove(int move) throws AlreadyOccupiedException,
                                          BoundaryException,
                                          IllegalSymbolException{
        checkForWinner();
        Coordinates coord = DimensionMapper.getCoordinate(move);
        if(isOver){
            return board.get(coord.getRow(), coord.getColumn());
        }
        board.set(coord.getRow(), coord.getColumn(), currentPlayer.getMarker());
        return currentPlayer.getMarker();
    }

    /**
    *
    * @param value The location where we want to get the value from
    * <return> returns char value of location
    */
    public char getBoardValue(int value) throws BoundaryException {
        Coordinates coord = DimensionMapper.getCoordinate(value);
        return board.get(coord.getRow(), coord.getColumn());
    }

    /**
    * <return> returns current player
    */
    public String getCurrentPlayerName(){
        return currentPlayer.getName();
    }

    /**
    *
    * <return> returns
    */
    public boolean checkForWinner() throws BoundaryException{
        if(!checkDiagonal()){
            if(!checkHorizontal()){
                if(!checkVertical()){
                    return false;
                }
            }
        }
        isOver = true;
        return true;
    }

    /**
    *
    *
    */
    private boolean checkVertical() throws BoundaryException{
        for(int i = 0; i < 3; i++){
            if(board.get(i, 0) == board.get(i, 1) && board.get(i, 0) == board.get(i, 2)){
                if(board.get(i, 0) != PlayerSymbol.X && board.get(i, 0) != PlayerSymbol.O){
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    /**
    *
    *
    */
    private boolean checkHorizontal() throws BoundaryException{
        for(int i = 0; i < 3; i++){
            if(board.get(0, i) == board.get(1, i) && board.get(0, i) == board.get(2, i)){
                if(board.get(0, i) != PlayerSymbol.X && board.get(0, i) != PlayerSymbol.O){
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    /**
    *
    *
    */
    private boolean checkDiagonal() throws BoundaryException{
        if(board.get(0, 0) == board.get(1, 1) && board.get(1, 1) == board.get(2, 2)) {
            if(board.get(0, 0) != PlayerSymbol.X && board.get(0, 0) != PlayerSymbol.O){
                    return false;
            }
            return true;
        }
        if(board.get(0, 2) == board.get(1, 1) && board.get(1, 1) == board.get(2, 0)){
            if(board.get(0, 2) != PlayerSymbol.X && board.get(0, 2) != PlayerSymbol.O){
                    return false;
            }
            return true;
        }
        return false;
    }
}
