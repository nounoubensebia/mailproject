package ecole;

public class DirecteurEcole {

    private static int id=0;
    private String nom;
    private Boolean vire;


    /**
     * Constructeur d'objets de classe DirecteurEcole
     */
    public DirecteurEcole(String Nom)
    {
        id++;
        this.nom=Nom;
        this.vire=false;


    }
    public String getNom(){
        return this.nom;
    }

    public int getId(){
        return this.id;
    }
    public Boolean getVire(){
        return this.vire;
    }

    public void setNom(String nom){
        this.nom=nom;
    }
    public Boolean virer(){
        return vire;
    }


    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôtre
     *
     * @param  y   le paramètre de la méthode
     * @return     la somme de x et de y
     */

}
