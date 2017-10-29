package is.ru.TicTacToe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.net.Urls;
import java.net.MalformedURLException;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.remote.DesiredCapabilities; 
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.net.URL;
import java.lang.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;

public abstract class SeleniumTestWrapper {
  //static ChromeDriver driver;
  static String baseUrl;
  static String port;
  static WebDriver driver;

  public static final String USERNAME = "arnarpeturs";
  public static final String ACCESS_KEY = "d1bd2ddd-bd70-471e-a49e-204c0435fb93";
  public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";

  @BeforeClass
  public static void openBrowser() throws MalformedURLException {
  /*  driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);*/

  DesiredCapabilities caps = DesiredCapabilities.chrome();
  /*caps.setCapability("platform", "Windows XP");
  caps.setCapability("version", "43.0");*/
  driver = new RemoteWebDriver(new URL(URL), caps);

  port = System.getenv("PORT");
    if (port == null) {
        port = "4567";
    }
    baseUrl = "http://localhost:" + port;
  }

  @AfterClass
  public static void closeBrowser(){
    driver.quit();
  }
}
