package is.ru.TicTacToe;

import static spark.Spark.*;
import spark.*;
import spark.servlet.SparkApplication;
import is.ru.TicTacToe.exceptions.*;

public class WebServer implements SparkApplication
{
    
    private TicTacToe tic;

    public static void main(String[] args) {
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

        post("/btn1", (req, res) ->  handleRequest(0));
        post("/btn2", (req, res) ->  handleRequest(1));
        post("/btn3", (req, res) ->  handleRequest(2));
        post("/btn4", (req, res) ->  handleRequest(3));
        post("/btn5", (req, res) ->  handleRequest(4));
        post("/btn6", (req, res) ->  handleRequest(5));
        post("/btn7", (req, res) ->  handleRequest(6));
        post("/btn8", (req, res) ->  handleRequest(7));
        post("/btn9", (req, res) ->  handleRequest(8));
        
    }

    private char handleRequest(int value)throws AlreadyOccupiedException,
                                                BoundaryException,
                                                IllegalSymbolException{
        try
        {
            tic.makeMove(value);
        }
        catch (IllegalSymbolException ex) { }
        catch (BoundaryException ex) { }
        catch (AlreadyOccupiedException ex) { }

        tic.changePlayer();
        return tic.getBoardValue(value);
    }
/*
    private char handleRequest(int value) throws AlreadyOccupiedException,
                                                 BoundaryException,
                                                 IllegalSymbolException{
        tic.makeMove(value);
        return tic.getBoardValue(value);
    }
*/
}