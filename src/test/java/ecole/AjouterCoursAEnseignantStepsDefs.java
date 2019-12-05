package ecole;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.ArrayList;

public class AjouterCoursAEnseignantStepsDefs {

    private Enseignant e1;
    private Cours c1;

    @Given("notre Enseignant avec un nombre de cours et avec un nombre maximal de cours")
    public void notre_Enseignant_avec_un_nombre_de_cours_et_avec_un_nombre_maximal_de_cours() {
        // Write code here that turns the phrase above into concrete actions
        ArrayList<Cours> listCours = new ArrayList<Cours>();
        e1 = new Enseignant("Dupont","Dupont",
                2000,Ecole.getInstance(),listCours,
                3);
        c1 = new Cours("Point");
    }

    @When("le nombre de cours en ajoutant le nouveau cours ne depasse pas le nombre maximal de cours")
    public void le_nombre_de_cours_en_ajoutant_le_nouveau_cours_ne_depasse_pas_le_nombre_maximal_de_cours() {
        // Write code here that turns the phrase above into concrete actions
        e1.ajouterCours(c1);
    }

    @Then("le nouveau cours devrait apparaitre sur sa liste de cours")
    public void le_nouveau_cours_devrait_apparaitre_sur_sa_liste_de_cours() {
        // Write code here that turns the phrase above into concrete actions
        boolean b = false;
        for (Cours cours:e1.getListCours())
        {
            if (cours == c1)
            {
                b = true;
            }
        }

        Assert.assertTrue(b);
    }

    @Given("notre Enseignant avec un nombre de cours et avec un nombre maximal de cours qui est deja atteint")
    public void notreEnseignantAvecUnNombreDeCoursEtAvecUnNombreMaximalDeCoursQuiEstDejaAtteint() {
        ArrayList<Cours> listCours = new ArrayList<Cours>();
        listCours.add(new Cours("cours1"));
        e1 = new Enseignant("Dupont","Dupont",
                2000,Ecole.getInstance(),listCours,
                1);
        c1 = new Cours("cours2");
    }

    @When("le nombre de cours en ajoutant le nouveau cours depasse le nombre maximal de cours")
    public void le_nombre_de_cours_en_ajoutant_le_nouveau_cours_depasse_le_nombre_maximal_de_cours() {
        // Write code here that turns the phrase above into concrete actions
        e1.ajouterCours(c1);
    }

    @Then("le nouveau cours ne devrait apparaitre sur sa liste de cours")
    public void le_nouveau_cours_ne_devrait_apparaitre_sur_sa_liste_de_cours() {
        // Write code here that turns the phrase above into concrete actions
        boolean b = false;
        for (Cours cours:e1.getListCours())
        {
            if (cours == c1)
            {
                b = true;
            }
        }

        Assert.assertFalse(b);

    }


}
