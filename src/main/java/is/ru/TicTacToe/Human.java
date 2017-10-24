package is.ru.TicTacToe;

import java.util.Scanner;


public class Human extends Player {
    protected String name;
    protected char marker;
    protected int numberOfWins;

    public Human(String name, char marker){
        super(name, marker);
    }

    public void playerAction(TicTacToe tic){
        Scanner in = new Scanner(System.in);
        while(true){
            int coord = in.nextInt();
            tic.b.getCoordinate(coord);
            if (coord < 1 || coord > 9) {
                System.out.println("Illegal Move! Try Again! Retard!");
            } else if (tic.b.board[tic.b.getX()][tic.b.getY()] == tic.getPlayer2().marker ||
                    tic.b.board[tic.b.getX()][tic.b.getY()] == tic.getPlayer1().marker ) {
                System.out.println("Already Taken! Try Again! Retard!");
            } else{
                tic.b.board[tic.b.getX()][tic.b.getY()] = tic.getCurrentPlayer().marker;
                break;
            }
        }
    }
}

