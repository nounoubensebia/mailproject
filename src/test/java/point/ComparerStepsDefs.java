package point;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import point.Point;

public class ComparerStepsDefs {
    Point p1;
    Point p2;
    boolean c;

    @Given("Deux Points A et B tel que A = {double} {double} et B = {double} {double}")
    public void deux_Points_A_et_B_tel_que_A_et_B(Double double1, Double double2,
                                                  Double double3, Double double4) {
        // Write code here that turns the phrase above into concrete actions
        p1 = new Point(double1.floatValue(),double2.floatValue());
        p2 = new Point(double3.floatValue(),double4.floatValue());
    }

    @When("On compare s'ils ont les memes coordonnees, comparer\\(A,B)")
    public void on_compare_s_ils_ont_les_memes_coordonnees_comparer_A_B() {
        // Write code here that turns the phrase above into concrete actions
        c = Point.compare(p1,p2);
    }

    @Then("Le retour doit etre un booleen {string} = vrai si A et B ont les memes coordonnees ou faux")
    public void le_retour_doit_etre_un_booleen_vrai_si_A_et_B_ont_les_memes_coordonnees_ou_faux(String string) {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(Boolean.valueOf(string),c);
    }
}
