Feature: Ajouter un cours a un enseignant



  Scenario:
    Given notre Enseignant avec un nombre de cours et avec un nombre maximal de cours
    When le nombre de cours en ajoutant le nouveau cours ne depasse pas le nombre maximal de cours
    Then le nouveau cours devrait apparaitre sur sa liste de cours

  Scenario:
    Given notre Enseignant avec un nombre de cours et avec un nombre maximal de cours qui est deja atteint
    When le nombre de cours en ajoutant le nouveau cours depasse le nombre maximal de cours
    Then le nouveau cours ne devrait apparaitre sur sa liste de cours
