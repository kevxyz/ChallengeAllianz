package steps;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.LoginPage;
import pages.ProductsPage;
import utilities.WebDriverManager;

import java.time.Duration;

public class LoginStepDefs {
    private WebDriver driver;

    private LoginPage loginPage ;
    private ProductsPage productsPage;
    
    
  @Before
  public void setup() {

      driver = WebDriverManager.getDriver();
      loginPage = new LoginPage(driver);
      productsPage= new ProductsPage(driver);
  }

  @After
  public void tearDown() throws InterruptedException {
      Thread.sleep(5000);
        WebDriverManager.cerrarDriver();
  }

  @Dado("que estoy en la pagina de login de Swag Labs")
  public void queEstoyEnLaPaginaDeLoginDeSwagLabs() {
      final String url = "https://www.saucedemo.com/";
      try {
          driver.get(url);
      } catch (Exception e) {
          System.err.println("Error al cargar la página de login: " + e.getMessage());
      }

  }

    @Cuando("ingreso el usuario {string} y la contraseña {string}")
    public void ingresoElUsuarioYLaContrasena(String usuario, String contrasena) {

        loginPage.ingresarUsuario(usuario);
        loginPage.ingresarContrasena(contrasena);
        loginPage.clickLogin();
    }

    @Entonces("debo ver la página principal")
    public void deboVerLaPaginaPrincipal() {
        Assert.assertTrue(productsPage.isPaginaPrincipalVisible());
    }
    @Entonces("debo ver un mensaje de error")
     public void deboVerUnMensajeDeError() {
            Assert.assertTrue(loginPage.isMensajeErrorVisible());
        }

    }
