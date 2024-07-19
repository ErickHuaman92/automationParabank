Feature: Registro de cliente en web Parabank

  @registrarClienteParabank
  Scenario: Registrar cliente en web Parabank
    Given usuario navega a sitio "parabank.web"
    When usuario se registra en la web con datos aleatorios
    Then valida mensaje de registro exitoso
    And usuario navega a sitio "parabank.web"
    When usuario se loguea a la web
    Then visualiza pantalla de login exitoso

