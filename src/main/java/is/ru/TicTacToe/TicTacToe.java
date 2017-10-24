package is.ru.TicTacToe;

public class TicTacToe{

	public Player player1, player2, currentPlayer;
	public Board b;
	public int actions;

	public TicTacToe(){
		b = new Board();
		b.fillBoard();
		player1 = new Player("Player 1", 'X');
        player2 = new Player("Player 2", 'O');
        currentPlayer = player1;
        actions = 0;
	}
}