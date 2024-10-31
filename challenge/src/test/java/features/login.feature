# language: es
Característica: Login
  Como usuario, quiero poder iniciar sesión

  @Test
  Escenario: Login con usuario y contraseña válidos - Usuario estándar
    Dado que estoy en la pagina de login de Swag Labs
    Cuando ingreso el usuario "standard_user" y la contraseña "secret_sauce"
    Entonces debo ver la página principal

  Escenario: Login con usuario y contraseña válidos - Usuario locked_out
    Dado que estoy en la pagina de login de Swag Labs
    Cuando ingreso el usuario "locked_out_user" y la contraseña "secret_sauce"
    Entonces debo ver un mensaje de error

  Escenario: Login con usuario y contraseña válidos - Usuario problem_user
    Dado que estoy en la pagina de login de Swag Labs
    Cuando ingreso el usuario "problem_user" y la contraseña "secret_sauce"
    Entonces debo ver la página principal

  Escenario: Login con usuario y contraseña válidos - Usuario performance_glitch_user
    Dado que estoy en la pagina de login de Swag Labs
    Cuando ingreso el usuario "performance_glitch_user" y la contraseña "secret_sauce"
    Entonces debo ver la página principal

  Escenario: Login con usuario y contraseña inválidos
    Dado que estoy en la pagina de login de Swag Labs
    Cuando ingreso el usuario "invalid_user" y la contraseña "invalid_password"
    Entonces debo ver un mensaje de error

  Escenario: Login con usuario y contraseña en Blanco
    Dado que estoy en la pagina de login de Swag Labs
    Cuando ingreso el usuario "standard_user" y la contraseña ""
    Entonces debo ver un mensaje de error