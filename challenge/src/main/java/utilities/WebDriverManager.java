package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverManager {
    private static WebDriver driver;

  public static WebDriver getDriver() {
      System.setProperty("webdriver.chrome.driver", "src\\test\\java\\resources\\drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
      ChromeOptions cop = new ChromeOptions();
      cop.addArguments("--remote-allow-origins=*"); //websocket error con chromedriver
      driver = new ChromeDriver(cop);
      driver.manage().window().maximize();
    return driver;
  }
  public static void cerrarDriver() {
      driver.quit();

  }
}
