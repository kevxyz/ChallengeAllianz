package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class ProductsPage {
    private WebDriver driver;

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }
    public boolean isPaginaPrincipalVisible() {
        return driver.findElement(By.className("app_logo")).isDisplayed();
    }
}
