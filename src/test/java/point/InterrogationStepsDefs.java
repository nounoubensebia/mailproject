package point;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.sl.Ce;
import ecole.Cours;
import ecole.Etudiant;
import org.junit.Assert;
import point.Cercle;
import point.Point;

public class InterrogationStepsDefs {

    Etudiant dupont;
    Cercle cercle;
    int noteTd;

    @Given("un etudiant Dupont et cercle ayant pour centre un point {int} {int} et un rayon {int}")
    public void un_etudiant_Dupont_et_cercle_ayant_pour_centre_un_point_et_un_rayon(Integer int1, Integer int2, Integer int3) {
        // Write code here that turns the phrase above into concrete actions
        dupont = new Etudiant("dupont");
        cercle = new Cercle(new Point(int1,int2),int3);
        dupont.addCours(new Cours.Builder("Geometrie",20).build());
    }

    @When("l etudiant reussit a deplacer le cercle d'un vecteur ayant les coordonnees {int} {int} en donnant de nouvelles coordonnes {int} {int} au centre du cercle")
    public void l_etudiant_reussit_a_deplacer_le_cercle_d_un_vecteur_ayant_les_coordonnees_en_donnant_de_nouvelles_coordonnes_au_centre_du_cercle(Integer int1, Integer int2, Integer int3, Integer int4) {
        // Write code here that turns the phrase above into concrete actions
        Point ancienCentre = cercle.getCentre();
        cercle.setCentre(new Point(int3,int4));
        noteTd = cercle.getNoteInterrogation(ancienCentre,int1,int2);
    }

    @Then("la note du TD de geometrie sera egale a la note complete {int}.")
    public void laNoteDuTDDeGeometrieSeraEgaleALaNoteComplete(int arg0) {
        Assert.assertEquals(noteTd,20);
    }
    @When("l etudiant ne reussit pas a deplacer le cercle d'un vecteur ayant les coordonnees {int} {int} en donnant de nouvelles coordonnes {int} {int} au centre du cercle")
    public void l_etudiant_ne_reussit_pas_a_deplacer_le_cercle_d_un_vecteur_ayant_les_coordonnees_en_donnant_de_nouvelles_coordonnes_au_centre_du_cercle(Integer int1, Integer int2, Integer int3, Integer int4) {
        // Write code here that turns the phrase above into concrete actions
        Point ancienCentre = cercle.getCentre();
        cercle.setCentre(new Point(int3,int4));
        noteTd = cercle.getNoteInterrogation(ancienCentre,int1,int2);
    }



    @Then("la note du TD de geometrie sera egale a la note zero.")
    public void laNoteDuTDDeGeometrieSeraEgaleALaNoteZero() {
        Assert.assertEquals(noteTd,0);
    }
}
