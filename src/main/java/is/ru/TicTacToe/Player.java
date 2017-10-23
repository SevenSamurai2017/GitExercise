package is.ru.TicTacToe;


public class Player {

    protected String name;
    protected char marker;
    protected int numberOfWins;

    public Player(String name, char marker){
        this.name = name;
        this.marker = marker;
        numberOfWins = 0;
    }
    public String getName(){
        return name;
    }

    public int getNumberOfWins(){
        return numberOfWins;
    }

    public void playerWon(){
    	numberOfWins++;
    }

    public void playerAction(tictactoe tic){

    }
}
