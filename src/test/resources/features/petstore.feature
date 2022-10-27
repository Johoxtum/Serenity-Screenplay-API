Feature: Como cliente deseo utilizar los diferentes servicios de la pagina
  @Creacion
  Scenario: Como cliente deseo crear una mascota en la base de datos
    Given que el usuario desea registrar una mascota
    When registra los datos
    Then Valida la respuesta en 200
    And Se valida el esquema "Mascota_validation"

  @Consulta
  Scenario: Como cliente deseo consultar las mascotas en la base de datos
    Given que el usuario desea consultar las mascotas
    When envia la peticion
    Then Valida la respuesta con un codigo 200
    And Se valida el siguiente esquema "Mascota_validation"
