package ecole;

import java.util.LinkedList;
import java.util.List;

public class Etudiant {

    private int matricule;
    private String nomEtudiant;
    private List<Cours> listCours;

    public Etudiant(String nomEtudiant) {
        this.nomEtudiant = nomEtudiant;
        this.listCours = new LinkedList<Cours>();
    }

    public void addCours(Cours cours)
    {
        listCours.add(cours);
    }

    public String getNomCours(){
        return this.nomEtudiant;
    }

    public List<Cours> getListCours() {
        return new LinkedList<Cours>(listCours);
    }
}
