package is.ru.TicTacToe;


import static org.junit.Assert.assertEquals;
import org.junit.Test;

import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestTicTacToe extends SeleniumTestWrapper {
  @Test
  public void testTitleMatches() {
    driver.get(baseUrl);
    assertEquals("TicTacToe", driver.getTitle());
  }

  @Test
  public void testOneClick() throws Exception {
    driver.get(baseUrl);
    Thread.sleep(2000);
    WebElement input = driver.findElement(By.id("btn1"));
    input.click();
    Thread.sleep(5000);
    assertEquals("X", driver.findElement(By.id("btn1")).getAttribute("value"));
  }
}