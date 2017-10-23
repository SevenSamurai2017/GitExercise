
package is.ru.TicTacToe;

public class Board {

    public char board[][];

    public Board(){
    	board = new char[3][3];
    }
    public void fillBoard(){
    	char counter = '1';
    	for (int i = 0; i < 3 ;i++) {
    		for (int j = 0; j < 3 ;j++) {
    			board[i][j] = counter;
    			counter++;
    		}
    	}
    }
    public void printBoard(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println("");
        }
    }
    public char checkVertical(){
        for(int i = 0; i < 3; i++){
            if(board[i][0] == board[i][1] && board[i][0] == board[i][2]){
                return board[i][0];
            }
        }
        return '1';
    }        
    public char checkHorizontal(){
        for(int i = 0; i < 3; i++){
            if(board[0][i] == board[1][i] && board[0][i] == board[2][i]){
                return board[0][i];
            }
        }
        return '1';
    }
    public char checkDiagonal(){
 	    if(board[0][0] == board[1][1] && board[1][1] == board[2][2]){
            return board[0][0];
        }
        if(board[0][2] == board[1][1] && board[1][1] == board[2][0]){
            return board[0][2];
        }
        return '1';
    }
}

