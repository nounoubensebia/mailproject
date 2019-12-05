import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class DeplacerStepsDefs {

    Cercle c;

    @Given("Un cercle ayant comme centre un point {double} {double}")
    public void un_cercle_ayant_comme_centre_un_point(Double double1, Double double2) {
        // Write code here that turns the phrase above into concrete actions
        c = new Cercle(new Point(double1.floatValue(),double2.floatValue()),2);
    }

    @When("On le deplace d'un vecteur ayant pour coordonnees {double} {double}")
    public void on_le_deplace_d_un_vecteur_ayant_pour_coordonnees(Double double1, Double double2) {
        // Write code here that turns the phrase above into concrete actions
        c.deplacerCercle(double1.floatValue(),double2.floatValue());
    }

    @Then("Le centre du cercle deplace {double} {double} doit etre calcule")
    public void le_centre_du_cercle_deplace_doit_etre_calcule(Double double1, Double double2) {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(double1.floatValue(),c.getP().getX(),0.00001);
        Assert.assertEquals(double2.floatValue(),c.getP().getY(),0.00001);
    }

}
