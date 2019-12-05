package point;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import point.Point;

public class DistanceStepsDefs {

    Point p1;
    Point p2;
    float dist;


    @Given("Deux points A et B tel que A = \\({double} {double}) et B = \\({double} {double})")
    public void deux_points_A_et_B_tel_que_A_et_B(Double double1, Double double2, Double double3, Double double4) {
        // Write code here that turns the phrase above into concrete actions
        p1 = new Point(double1.floatValue(),double2.floatValue());
        p2 = new Point(double3.floatValue(),double4.floatValue());

    }


    @When("On calcule la distance entre A et B, distance\\(A,B)")
    public void on_calcule_la_distance_entre_A_et_B_distance_A_B() {
        // Write code here that turns the phrase above into concrete actions
        this.dist = Point.distance(p1,p2);
    }

    @Then("Le retour est une distance positive {double}")
    public void le_retour_est_une_distance_positive(Double int1) {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(int1,this.dist,0.001);
    }

}
