package ecole;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class CalculerMoyenneStepsDefs {

    Cours cours;
    float moyenne;

    @Given("un etudiant Dupont qui a fini  un cours de Geometrie on lui attribut trois notes tp={int},  td={int}, ex={int}")
    public void un_etudiant_Dupont_qui_a_fini_un_cours_de_Geometrie_on_lui_attribut_trois_notes_tp_td_ex(Integer int1, Integer int2, Integer int3) {
        // Write code here that turns the phrase above into concrete actions
        Cours.Builder builder = new Cours.Builder("Geometrie",20);
        builder.withNoteTp(int1);
        builder.withNoteTd(int2);
        builder.withNoteExam(int3);
        builder.withCalculMoyenneStrategy(new MoyenneMath());
        cours = builder.build();
    }

    @When("on calcule la moyenne  de ses trois notes")
    public void on_calcule_la_moyenne_de_ses_trois_notes() {
        // Write code here that turns the phrase above into concrete actions
        moyenne = cours.calculerMoyenne();
    }

    @Then("on aura pour resultat la moyenne de l etudiant pour ce cours moyenne = {double}")
    public void on_aura_pour_resultat_la_moyenne_de_l_etudiant_pour_ce_cours_moyenne(Double double1) {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(double1.floatValue(),moyenne,0.00001);
    }
}
