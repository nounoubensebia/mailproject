package ecole;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import point.Point;

import java.util.ArrayList;


public class AjouterChapitreStepsDefs {

    Cours c1;
    Chapitre ch1;

    @Given("le cours geometrie avec actuellement un volume horaire cumule de vingt heures  et un volume horaire maximum de trente-quatre")
    public void le_cours_geometrie_avec_actuellement_un_volume_horaire_cumule_de_vingt_heures_et_un_volume_horaire_maximum_de_trente_quatre() {
        // Write code here that turns the phrase above into concrete actions
        ArrayList<Chapitre> chapitres = new ArrayList<Chapitre>();
        chapitres.add(new Chapitre("ch1",10));
        chapitres.add(new Chapitre("ch2",14));
        c1 = new Cours("Geometrie",34,chapitres);
        ch1 = new Point();
    }

    @When("on ajoute le chapitre point ayant le volume horaire de quatre heures au cours geometrie")
    public void on_ajoute_le_chapitre_point_ayant_le_volume_horaire_de_quatre_heures_au_cours_geometrie() {
        // Write code here that turns the phrase above into concrete actions
        c1.addChapitre(ch1);
    }

    @Then("on doit voir apparaitre le chapitre point sur le cours geometrie")
    public void on_doit_voir_apparaitre_le_chapitre_point_sur_le_cours_geometrie() {
        // Write code here that turns the phrase above into concrete actions
        boolean b = false;
        for (Chapitre chapitre:c1.getChapitres())
        {
            if (chapitre == ch1)
                b = true;
        }

        Assert.assertTrue(b);

    }

    @Given("le cours d'algebre avec actuellement un volume horaire cumule de vingt-quatre heures  et un volume horaire maximum de vingt-quatres heures")
    public void le_cours_d_algebre_avec_actuellement_un_volume_horaire_cumule_de_vingt_quatre_heures_et_un_volume_horaire_maximum_de_vingt_quatres_heures() {
        // Write code here that turns the phrase above into concrete actions
        ArrayList<Chapitre> chapitres = new ArrayList<Chapitre>();
        chapitres.add(new Chapitre("ch1",10));
        chapitres.add(new Chapitre("ch2",14));
        c1 = new Cours("Algebre",24,chapitres);
        ch1 = new Point();
    }

    @When("on ajoute le chapitre point ayant le volume horaire de quatre heures au cours algebre")
    public void on_ajoute_le_chapitre_point_ayant_le_volume_horaire_de_quatre_heures_au_cours_algebre() {
        // Write code here that turns the phrase above into concrete actions
        c1.addChapitre(ch1);
    }

    @Then("le cours d'algebre ne doit pas contenir le chapitre point.")
    public void le_cours_d_algebre_ne_doit_pas_contenir_le_chapitre_point() {
        // Write code here that turns the phrase above into concrete actions
        boolean b = false;
        for (Chapitre chapitre:c1.getChapitres())
        {
            if (chapitre == ch1)
                b = true;
        }

        Assert.assertFalse(b);
    }

}
