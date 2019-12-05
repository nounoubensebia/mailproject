package ecole;

public class Cours {

    private static Cours instance;
    private String nomCours;
    static float noteCours;
    static float noteTd;

    private Cours()
    {

    }

    public Cours getInstance()
    {

        if (instance==null)
        {
            instance = new Cours();
        }
        return instance;
    }

    private Cours(String nomEcole, DirecteurEcole directeur)
    {
        this.nomCours=nomCours;
    }

    public String getNomCours(){
        return this.nomCours;
    }

}
