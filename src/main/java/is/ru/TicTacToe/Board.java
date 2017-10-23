
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

}

