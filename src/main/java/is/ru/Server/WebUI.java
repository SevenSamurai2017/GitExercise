package is.ru.Server;

import static spark.Spark.*;
import spark.*;
import spark.servlet.SparkApplication;
import is.ru.TicTacToe.*;
import is.ru.TicTacToe.exceptions.*;

public class WebUI implements SparkApplication
{
    
    private TicTacToe tic;

    public static void main(String[] args)
    {
        staticFileLocation("/web");
        SparkApplication web  = new WebUI();
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
        
        get("/", (req, res) ->  {
            tic = new TicTacToe();
            res.status(200);
            return "";
        });
    }

    private char handleRequest(int value) throws AlreadyOccupiedException,
                                                 BoundaryException,
                                                 IllegalSymbolException{
        
        char nextmarker = ' ';
        try{
            nextmarker = tic.makeMove(value);
            tic.changePlayer();
        }
        catch (AlreadyOccupiedException ex){}
        catch (BoundaryException ex) {}
        catch (IllegalSymbolException ex){}
        
        return nextmarker;
    }

}