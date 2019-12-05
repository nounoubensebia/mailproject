package ecole;

import java.util.List;

public class Cours {

    private String nomCours;
    private int volumeHoraireMax;




    public Cours(String nomCours) {
        this.nomCours = nomCours;
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

}
