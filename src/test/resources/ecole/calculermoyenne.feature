Feature:calculerMoyenne

  Scenario Outline:
    Given  un etudiant Dupont qui a fini  un cours de Geometrie on lui attribut trois notes tp=14,  td=13, ex=12
    When  on calcule la moyenne  de ses trois notes
    Then on aura pour resultat la moyenne de l etudiant pour ce cours moyenne = 12.6
    Examples:
      |tp  |td|ex|moy|
      |14  |13|12|12.6|
