package ecole;

import java.util.ArrayList;
import java.util.List;

public class Enseignant {
    private String nom;
    private String prenom;
    private static int id=0;
    private double salaire;
    private List<Cours> listCours;
    private int nombreMaxCours;

    Ecole ecole ;
    public Enseignant(String nom,String prenom,double salaire, Ecole ecole,
                      List<Cours> listCours,int nombreMaxCours)
    {
        id++;
        this.nom=nom;
        this.prenom=prenom;
        this.salaire=salaire;
        this.ecole=ecole;
        this.listCours = listCours;
        this.nombreMaxCours = nombreMaxCours;
    }


    public void ajouterCours (Cours cours)
    {
        if (listCours.size()+1<nombreMaxCours)
        {
            listCours.add(cours);
        }
    }

    public List<Cours> getListCours() {
        return new ArrayList<Cours>(listCours);
    }

    public double augmentationFinAnnee() {
        if (this.salaire < 3000){
            return this.salaire*1.05;
        }
        else {
            return this.salaire;
        }
    }
    public double salaire(){
        return this.salaire;
    }

    public boolean virer(String raison){
        if(raison==""){
            return false;
        }
        else return true;
    }
}
