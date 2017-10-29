package is.ru.TicTacToe.Game_domain;

import is.ru.TicTacToe.Game_exceptions.*;

public class Board {

    /**
    * A two dimensional array for the board
    */
    public int moveCounter;
    public char board[][];

    /**
    * Initializes the game board
    */
    public Board(){
        moveCounter = 0;
        board = new char[3][3];
        init();
    }

    /**
    * The set function checks if the selected location and marker are valid
    * marks the selected location with either X or O
    * @param row Row in board
    * @param col Column in board
    * @param marker Marks either X or O on the board
    * @throws AlreadyOccupiedException selected location is occupied
    * @throws BoundaryException invalid location
    * @throws IllegalSymbolException symbol is not correct
    */
    public void set(int row, int col, char marker)throws AlreadyOccupiedException,
                                                         BoundaryException,
                                                         IllegalSymbolException{
        BoundaryChecker.checkBoundary(row, col);
        if(marker != PlayerSymbol.X && marker != PlayerSymbol.O){
            throw new IllegalSymbolException();
        }
        if(board[row][col] == PlayerSymbol.X || board[row][col] == PlayerSymbol.O) {
            throw new AlreadyOccupiedException();
        }
        else {
            board[row][col] = marker;
            moveCounter++;
        }
    }

    /**
    * @param row Row in board
    * @param col Column in board
    * @throws BoundaryException invalid location
    * <return> returns char from the selected location
    */
    public char get(int row, int col)throws BoundaryException{
        BoundaryChecker.checkBoundary(row, col);
        return board[row][col];
    }

    /**
    * Initializes all locations in the board as empty
    */
    public void init(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                board[i][j] = ' ';
            }
        }
    }

	/**
	* Checks if board is full
	* <return> returns boolean
	*/
    public boolean isBoardFull(){
        return moveCounter == 9;
    }

    /**
    * Helper function for printing board in console
    */
    /*
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                str.append(this.board[i][j]);
            }
            str.append('\n');
        }
        return str.toString();
    }*/
}