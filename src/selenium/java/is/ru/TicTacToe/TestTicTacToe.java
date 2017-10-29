package is.ru.TicTacToe;

import java.lang.NullPointerException;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.net.MalformedURLException;
import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestTicTacToe extends SeleniumTestWrapper {
  @Test
  public void testTitleMatches() {
    driver.get("https://shielded-dawn-85701.herokuapp.com/");
    assertEquals("TicTacToe", driver.getTitle());
  }

  @Test
  public void testOneClick() throws MalformedURLException {
    driver.get("https://shielded-dawn-85701.herokuapp.com/");
    //Thread.sleep(2000);
    WebElement input = driver.findElement(By.id("btn1"));
    input.click();
    //Thread.sleep(5000);
    assertEquals("X", driver.findElement(By.id("btn1")).getAttribute("value"));
  }
}