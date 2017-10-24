package is.ru.TicTacToe;

import static spark.Spark.*;
import spark.*;
import spark.servlet.SparkApplication;

public class WebServer implements SparkApplication{

	private TicTacToe tic;

	public static void main(String[] args) {
		staticFileLocation("/web");
		SparkApplication web  = new WebServer();
		String port = System.getenv("PORT");
		if (port != null) port(Integer.valueOf(port));
		web.init();
	}

	@Override
	public void init(){

		get("/twoplayer", (req, res) -> {
            tic = new TicTacToe("Manni", "Hassi");
			res.redirect("/");
            return res;
        });

	}
}