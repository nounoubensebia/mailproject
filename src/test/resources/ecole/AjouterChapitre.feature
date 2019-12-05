Feature: Ajouter chapitre
  Le directeur d'école juge que le chapitre "Point" est important pour cela il décide d'inclure ce chapitre.
  Scenario:
    Given le cours geometrie avec actuellement un volume horaire cumule de vingt heures  et un volume horaire maximum de trente-quatre
    When on ajoute le chapitre point ayant le volume horaire de quatre heures au cours geometrie
    Then on doit voir apparaitre le chapitre point sur le cours geometrie

  Scenario:
    Given le cours d'algebre avec actuellement un volume horaire cumule de vingt-quatre heures  et un volume horaire maximum de vingt-quatres heures
    When on ajoute le chapitre point ayant le volume horaire de quatre heures au cours algebre
    Then le cours d'algebre ne doit pas contenir le chapitre point.