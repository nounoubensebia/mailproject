package ecole;

import java.util.List;

public class Ecole {

    private static Ecole instance;

    private String nomEcole;
    private DirecteurEcole directeur;
    List<Enseignant> enseignants;

    Ecole()
    {

    }

    public static Ecole getInstance()
    {
        if (instance==null)
        {
            instance = new Ecole("Dauphine",new DirecteurEcole("Dupont"));
        }
        return instance;
    }

    private Ecole(String nomEcole, DirecteurEcole directeur)
    {
        this.directeur=directeur;
        this.nomEcole=nomEcole;
    }

    public String getNomDirecteur(){
        return this.directeur.getNom();
    }
    public Boolean admetDirecteur(){
        return this.directeur.virer();
    }
}
