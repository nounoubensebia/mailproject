package ecole;

public class Cours {

    private String nomCours;

    public Cours(String nomCours) {
        this.nomCours = nomCours;
    }

    public String getNomCours(){
        return this.nomCours;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Cours)
        {
            Cours cours = (Cours) obj;
            return this.nomCours.equals(cours.nomCours);
        }
        return false;
    }
}
