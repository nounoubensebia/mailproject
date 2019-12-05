package ecole;

import java.util.ArrayList;
import java.util.List;

public class Cours {

    public static class Builder {
        private String nomCours;
        private int volumeHoraireMax;
        private List<Chapitre> chapitres;

        private float noteTd;
        private float noteTp;
        private float noteExamen;

        private CalculMoyenneStrategy calculMoyenneStrategy;

        private int coef;

        public Builder(String nomCours, int volumeHoraireMax) {
            this.nomCours = nomCours;
            this.volumeHoraireMax = volumeHoraireMax;
            this.chapitres = new ArrayList<Chapitre>();
        }

        public Cours build ()
        {
            return new Cours(this);
        }
        public void withNoteTd(float noteTd)
        {
            this.noteTd = noteTd;
        }

        public void withNoteTp (float noteTp)
        {
            this.noteTp = noteTp;
        }

        public void withNoteExam (float noteExam)
        {
            this.noteExamen = noteExam;
        }

        public void withCalculMoyenneStrategy(CalculMoyenneStrategy calculMoyenneStrategy)
        {
            this.calculMoyenneStrategy = calculMoyenneStrategy;
        }

    }

    private String nomCours;
    private int volumeHoraireMax;
    private List<Chapitre> chapitres;

    private float noteTd;
    private float noteTp;
    private float noteExamen;

    private CalculMoyenneStrategy calculMoyenneStrategy;

    private Cours(Builder builder)
    {
        this.nomCours = builder.nomCours;
        this.chapitres = builder.chapitres;
        this.volumeHoraireMax = builder.volumeHoraireMax;
        this.noteTd = builder.noteTd;
        this.noteTp = builder.noteTp;
        this.noteExamen = builder.noteExamen;
        this.calculMoyenneStrategy = builder.calculMoyenneStrategy;
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
    public void addChapitre(Chapitre ch) {
        if(ch==null){
            return;
        }
        int horaire = 0;
        for (Chapitre chapitre : chapitres) {
            horaire += chapitre.getVolumeHoraire();
        }
        horaire+=ch.getVolumeHoraire();
        if (horaire < this.volumeHoraireMax) {
            chapitres.add(ch);
        }

    }

    public float calculerMoyenne ()
    {
        return calculMoyenneStrategy.CalculerMoyenne(noteTd,noteTp,noteExamen);
    }

    public float getNoteTd() {
        return noteTd;
    }

    public float getNoteTp() {
        return noteTp;
    }

    public float getNoteExamen() {
        return noteExamen;
    }

    public CalculMoyenneStrategy getCalculMoyenneStrategy() {
        return calculMoyenneStrategy;
    }
}
