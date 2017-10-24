package is.ru.TicTacToe;

import java.util.Scanner;


public class Human extends Player {
    protected String name;
    protected char marker;
    protected int numberOfWins;

    public Human(String name, char marker){
        super(name, marker);
    }


}

