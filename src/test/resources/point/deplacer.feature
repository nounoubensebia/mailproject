Feature: Déplacer cercle

  En tant qu'utilisateur de la solution je souhaite déplacer un cercle d'un vecteur de déplacement

  Scenario Outline: Deplacer cercle
    Given Un cercle ayant comme centre un point <X1> <Y1>
    When On le deplace d'un vecteur ayant pour coordonnees <Xv> <Yv>
    Then Le centre du cercle deplace <X2> <Y2> doit etre calcule

    Examples:
      |X1|Y1|Xv|Yv|X2|Y2|
      |1.0 |2.0 |1.0 |1.0 |2.0 |3.0 |
      |5.0 |6.0 |2.0 |9.0 |7.0 |15.0|