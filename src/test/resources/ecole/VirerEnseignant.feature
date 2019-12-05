Feature: virer un enseignant ?
  En tant que DirecteurEcole
  Je veux verer un enseignant
  Afin de garder ma base de donnee a jour


  Scenario Outline: virer un enseignant( car il a provoque un incendie )
    Given    un <enseignant> dans une ecole
    When     l <enseignant> provoque une <raison>
    Then    l <enseignant> sera virer <valReteur>
    Examples:
      |  enseignant  | raison | valReteur|
      |  Enseignant | "incendie"    |  true   |
      |  Enseignant | ""    | false           |


