package is.ru.TicTacToe;

import is.ru.TicTacToe.exceptions.*;

public class Board {

    public char board[][];
    public Board(){
        board = new char[3][3];
        init();
    }

    public void set(int row, int col, char marker)throws AlreadyOccupiedException,
                                                         BoundaryException ,
                                                         IllegalSymbolException{
        BoundryChecker.checkBoundry(row, col);
        if(marker != PlayerSymbol.X && marker != PlayerSymbol.O){
            throw new IllegalSymbolException();
        }
        if(board[row][col] == PlayerSymbol.X || board[row][col] == PlayerSymbol.O) {
            throw new AlreadyOccupiedException();
        }
        else {
            board[row][col] = marker;
        }
    }

    public char get(int row, int col)throws BoundaryException{
        BoundryChecker.checkBoundry(row, col);
        return board[row][col];
    }

    public void init(){
        char counter = '1';
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                board[i][j] = counter;
                counter++;
            }
        }
    }

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
    }
}
