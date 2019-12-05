package ecole;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SalaireNoIncreaseStepsDefs {
    Enseignant enseignant;
    Enseignant enseignant2;
    @Given("un Enseignant avec un {int} eleve  dans une ecole")
    public void un_Enseignant_avec_un_eleve_dans_une_ecole(Integer int1) {
        DirecteurEcole dir = new DirecteurEcole("Dir");
        Ecole ecole = Ecole.getInstance();
        enseignant = new Enseignant("Sab", "Maya",3100,Ecole.getInstance(),null,1);
        enseignant2 = new Enseignant("Sab", "Maya",3500,Ecole.getInstance(),null,1);
    }

    @When("a la fin d annee  on doit verifier qu il y a pas d augmentation")
    public void a_la_fin_d_annee_on_doit_verifier_qu_il_y_a_pas_d_augmentation() {
        enseignant.augmentationFinAnnee();
    }

    @Then("le {int} de notre enseignant va rester le meme")
    public void le_de_notre_enseignant_va_rester_le_meme(Integer int1) {
        enseignant.salaire();
    }
}
