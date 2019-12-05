package ecole;

public class Etudiant {

    private static Etudiant instance;
    private String nomEtudiant;
    static float noteCours;
    static float noteTd;
    static float noteTp;
    private Cours cours;
    private Etudiant()
    {

    }

    public Etudiant getInstance()
    {

        if (instance==null)
        {
            instance = new Etudiant();
        }
        return instance;
    }

    private Etudiant(String nomEtudiant, Cours cours)
    {
        this.nomEtudiant=nomEtudiant;
        this.cours=cours;
    }

    public String getNomCours(){
        return this.nomEtudiant;
    }

}
