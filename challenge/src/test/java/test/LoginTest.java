package test;
import org.junit.Test;
import steps.LoginStepDefs;

public class LoginTest {

    @Test
  public void loginTest() {
    LoginStepDefs loginStepDefs = new LoginStepDefs();
    loginStepDefs.queEstoyEnLaPaginaDeLoginDeSwagLabs();
    loginStepDefs.ingresoElUsuarioYLaContrasena("standard_user", "secret_sauce");
    loginStepDefs.deboVerLaPaginaPrincipal();
  }

  @Test
  public void loginInvalidoTest() {
    LoginStepDefs loginStepDefs = new LoginStepDefs();
    loginStepDefs.queEstoyEnLaPaginaDeLoginDeSwagLabs();
    loginStepDefs.ingresoElUsuarioYLaContrasena("invalid_user", "invalid_password");
    loginStepDefs.deboVerUnMensajeDeError();
  }
}
