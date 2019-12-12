Feature: Etant donne que les  etudiants ne sont pas à jour durant les cours l'enseignant de geometrie decide de faire une interrogation surprise sur le chapitre "point" plus précisément sur la section "Cercle"   et cette note sera considéré comme la  note du TD de géométrie.
Scenario Outline:
  Given un etudiant Dupont et cercle ayant pour centre un point <X1> <Y1> et un rayon <R>
  When l etudiant deplace le cercle d'un vecteur ayant les coordonnees <V1> <V2> en donnant de nouvelles coordonnes <X2> <Y2> au centre du cercle
  Then la note du TD de geometrie sera egale a la note complete.
  Examples:
    | X1 | Y1 | R | V1 | V2 | X2 | Y2 |
    |4   |3   |2  |1   |1   |5   |4   |

  Scenario Outline:
    Given un etudiant Dupont et cercle ayant pour centre un point <X1> <Y1> et un rayon <R>
    When l etudiant ne reussit pas a deplacer le cercle d'un vecteur ayant les coordonnees <V1> <V2> en donnant de nouvelles coordonnes <X2> <Y2> au centre du cercle
    Then la note du TD de geometrie sera egale a la note zero.
    Examples:
      | X1 | Y1 | R | V1 | V2 | X2 | Y2 |
      |4   |3   |2  |1   |1   |6   |7   |