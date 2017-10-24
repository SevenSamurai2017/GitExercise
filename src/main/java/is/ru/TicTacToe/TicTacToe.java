package is.ru.TicTacToe;

public class TicTacToe{

	public Player player1, player2, currentPlayer;
	public Board b;
	public int actions;

	// Basic Game
	public TicTacToe(){
		b = new Board();
		b.fillBoard();
		player1 = new Player("Player 1", 'X');
        player2 = new Player("Player 2", 'O');
        currentPlayer = player1;
        actions = 0;
	}

	// Game with custom names(Player vs Player)
	public TicTacToe(String p1Name, String p2Name){
		b = new Board();
        b.fillBoard();
        player1 = new Player(p1Name, 'X');
        player2 = new Player(p2Name, 'O');
        currentPlayer = player1;
        actions = 0;
	}

	public boolean checkForWin(){
        char winner;
        winner = b.checkDiagonal();
        if(winner != '1'){
            System.out.println(currentPlayer.name + " is the winner!");
            currentPlayer.numberOfWins++;
            return true;
        }
        winner = b.checkHorizontal();
        if(winner != '1'){
            System.out.println(currentPlayer.name + " is the winner!");
            currentPlayer.numberOfWins++;
            return true;
        }
        winner = b.checkVertical();
        if(winner != '1'){
            System.out.println(currentPlayer.name + " is the winner!");
            currentPlayer.numberOfWins++;
            return true;
        }
        return false;
    }

    public void changePlayer(){
        if(currentPlayer == player1){
            currentPlayer = player2;
        }
        else if(currentPlayer == player2){
            currentPlayer = player1;
        }
        actions++;
    }
}