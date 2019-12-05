Feature: augmentation de salaire pour les Enseignants  ?
   En tant que DirecteurEcole
   Je veux vérifier que le salaire des enseignants à augmenter
   Afin de m'assurer que l'augmentation s'est bien effectué


  Scenario Outline: Augmentation fin d annee ( salaire inferieur a 3000)
    Given    un <enseignant> avec un <salaire1>  dans une ecole
    When   a la fin d annee  on doit augmenter notre enseignant
    Then    le <salaire2> de notre enseignant va augmenter de 0.05
   Examples:
    |  enseignant  | salaire1| salaire2|
    | Enseignant  | 2500    |  2625   |
    |  Enseignant | 2010    | 2110  |

  Scenario Outline: Non augmentation fin d annee ( salaire superieur a 3000)
    Given    un <professeur> avec un <sal> eleve  dans une ecole
    When   a la fin d annee  on doit verifier qu il y a pas d augmentation
    Then    le <sal> de notre enseignant va rester le meme
    Examples:
      |  professeur  | sal| sal|
      |  Enseignant | 3500 |3500 |
      |  Enseignant | 3010 |3010 |

