package ecole;

public class Enseignant {
    private String nom;
    private String prenom;
    private static int id=0;
    private double salaire;
    Ecole ecole ;
    public Enseignant(String nom,String prenom,double salaire, Ecole ecole)
    {
        id++;
        this.nom=nom;
        this.prenom=prenom;
        this.salaire=salaire;
        this.ecole=ecole;
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
