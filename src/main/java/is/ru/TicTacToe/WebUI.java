package is.ru.Server;

import static spark.Spark.*;
import spark.*;
import spark.servlet.SparkApplication;
import is.ru.TicTacToe.*;
/*
public class WebUI implements SparkApplication
{
    
    private TicTacToe tic;

    public static void main(String[] args)
    {
        staticFileLocation("/web");
        SparkApplication web  = new WebServer();
        String port = System.getenv("PORT");
        if (port != null) port(Integer.valueOf(port));
        web.init();
    }

    @Override
    public void init()
    {
        tic = new TicTacToe();
        
        get("/", (req, res) ->  {
                tic = new TicTacToe();
                res.status(200);
            return "";
        });

        post("/button1", (req, res) ->  handleRequest(0));
        post("/button2", (req, res) ->  handleRequest(1));
        post("/button3", (req, res) ->  handleRequest(2));
        post("/button4", (req, res) ->  handleRequest(3));
        post("/button5", (req, res) ->  handleRequest(4));
        post("/button6", (req, res) ->  handleRequest(5));
        post("/button7", (req, res) ->  handleRequest(6));
        post("/button8", (req, res) ->  handleRequest(7));
        post("/button9", (req, res) ->  handleRequest(8));

        post("/newgame", (req, res) ->  {
        
        get("/", (req, res) ->  {
            tic = new TicTacToe();
            res.status(200);
            return "";
        });
    }

    private char handleRequest(int value){
        try
        {
            return handleRequestHelper(value);
        }
        catch (BoundaryException e)
        {
            return ' ';
        }
    }

    private char handleRequestHelper(int index) throws OutOfBoundsException
    {
        try
        {
            ttt.add(index);
        }
        catch (SquareOccupiedException ex) { }
        catch (AlreadyOverException ex) { }
        return ttt.getSquare(index);
    }

    private String displayWinner()
    {
        try
        {
            return ttt.getWinner() == 1 ? "X wins" : "O wins";
        }
        catch (NoWinnerException ex)
        {
            return ttt.isOver() ? "draw" : "";
        }
    }
    
}*/