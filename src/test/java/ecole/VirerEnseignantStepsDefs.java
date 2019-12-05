package ecole;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class VirerEnseignantStepsDefs {
    Enseignant enseignant;
    Enseignant enseignant2;
    @Given("un Enseignant dans une ecole")
    public void un_Enseignant_dans_une_ecole() {
        DirecteurEcole dir = new DirecteurEcole("Dir");
        Ecole ecole = Ecole.getInstance();
        enseignant = new Enseignant("Sab", "Maya",3100,Ecole.getInstance(),null,2);
        enseignant2 = new Enseignant("Sab", "Maya",3500,Ecole.getInstance(),null,2);
    }
    @When("l Enseignant provoque une {string}")
    public void l_Enseignant_provoque_une(String string) {

    }
    @Then("l <enseignat> sera virer true")
    public void l_enseignat_sera_virer_true() {

    }

}
