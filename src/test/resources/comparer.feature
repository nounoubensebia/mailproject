Feature: Comparer deux points

  En tant qu'utilisateur de la solution

  Je veux déterminer si deux points ont les memes coordonnées ou pas.
  Deux points ont les memes coordonnées si les valeurs de leurs champs x et y, représentant leur position dans l'espace
  de coordonnées, sont identiques.

  Scenario Outline: Comparaison entre A et B
    Given Deux Points A et B tel que A = <X1> <Y1> et B = <X2> <Y2>
    When On compare s'ils ont les memes coordonnees, comparer(A,B)
    Then Le retour doit etre un booleen "<boola>" = vrai si A et B ont les memes coordonnees ou faux

    Examples:
      |X1|Y1|X2|Y2|boola|
      |0.0 |2.0 |0.0 |2.0 |true|
      |1.0 |3.0 |0.0 |1.0 |false|