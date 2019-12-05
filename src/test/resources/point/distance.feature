Feature: Calculer la distance
  En tant qu'utilisateur de la solution

  Je veux calculer la distance entre deux points A et B

  Scenario Outline: la distance
    Given Deux points A et B tel que A = (<X1> <Y1>) et B = (<X2> <Y2>)
    When On calcule la distance entre A et B, distance(A,B)
    Then Le retour est une distance positive <dista>

    Examples:
      |X1|Y1|X2|Y2|dista|
      |5.0 |4.0 |1.0 |1.0 |5.0|
      |6.0 |4.0 |5.0 |4.0 |1.0|