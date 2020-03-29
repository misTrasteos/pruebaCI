Feature: Sumar

  Scenario Outline: Sumar dos números
    Given la entrada es <PrimerSumando> más <SegundoSumando>
    #Given la entrada es 1 más 2
    When realizo la suma
    Then el resultado debe ser <ResultadoEsperado>

    #Then el resultado debe ser 3
    Examples: sumas correctas
      | PrimerSumando | SegundoSumando | ResultadoEsperado |
      |             1 |             23 |                24 |
      |             2 |             35 |                37 |
      |             3 |             56 |                59 |
      |             4 |             76 |                80 |
