package ecole;

import java.util.ArrayList;
import java.util.List;

public class Cours {

    private String nomCours;
    private int volumeHoraireMax;
    private List<Chapitre> chapitres;



    public Cours(String nomCours) {
        this.nomCours = nomCours;
    }

    public Cours(String nomCours, int volumeHoraireMax, List<Chapitre> chapitres) {
        this.nomCours = nomCours;
        this.volumeHoraireMax = volumeHoraireMax;
        this.chapitres = chapitres;
    }

    public String getNomCours(){
        return this.nomCours;
    }

    public void setNomCours(String nomCours) {
        this.nomCours = nomCours;
    }

    public int getVolumeHoraireMax() {
        return volumeHoraireMax;
    }

    public void setVolumeHoraireMax(int volumeHoraireMax) {
        this.volumeHoraireMax = volumeHoraireMax;
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

    public List<Chapitre> getChapitres() {
        return new ArrayList<Chapitre>(chapitres);
    }
}
