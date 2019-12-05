package ecole;

import java.util.List;

public class Ecole {
    private static int idEcole=0;
    private String nomEcole;
    private DirecteurEcole directeur;
    List<Enseignant> enseignant;

    public Ecole(String nomEcole, DirecteurEcole directeur)
    {
        this.directeur=directeur;
        idEcole++;
        this.nomEcole=nomEcole;
    }

    public String getNomDirecteur(){
        return this.directeur.getNom();
    }
    public Boolean admetDirecteur(){
        return this.directeur.virer();
    }
}
