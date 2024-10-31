package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class LoginPage {

    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void ingresarUsuario(String usuario) {
        driver.findElement(By.id("user-name")).sendKeys(usuario); //todo pasar elementos a web elements y agregar wait para revisar si son visibles
    }

    public void ingresarContrasena(String contrasena) {
        driver.findElement(By.id("password")).sendKeys(contrasena);
    }

    public void clickLogin() {
        driver.findElement(By.id("login-button")).click();
    }

    public boolean isMensajeErrorVisible() {
        return driver.findElement(By.xpath("//*[@class=\"error-message-container error\"]")).isDisplayed();
    }

}
