
package is.ru.TicTacToe;

public class Board {

	public int x, y;
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
    public void getCoordinate(int number){
	    if(number == 1){
	        x = 0;
	        y = 0;
	    }
	    else if(number == 2){
	        x = 0;
	        y = 1;
	    }
	    else if(number == 3){
	        x = 0;
	        y = 2;
	    }
	    else if(number == 4){
	        x = 1;
	        y = 0;
	    }
	    else if(number == 5){
	        x = 1;
	        y = 1;
	    }
	    else if(number == 6){
	        x = 1;
	        y = 2;
	    }
	    else if(number == 7){
	        x = 2;
	        y = 0;
	    }
	    else if(number == 8){
	        x = 2;
	        y = 1;
	    }
	    else if(number == 9){
	        x = 2;
	        y = 2;
	    }
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
}

