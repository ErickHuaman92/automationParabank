Feature: Registro de cliente en web Parabank

  @registrarClienteParabank
  Scenario Outline: Registrar cliente en web Parabank
    Given usuario "<usuario>" navega a sitio "parabank.web"

    Examples: Alta Pepper Online
      | usuario |
      | Erick|

