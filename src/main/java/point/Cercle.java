package point;

import ecole.Chapitre;

public class Cercle extends Chapitre {
    private Point centre;
    private float r;

    /**
     * Constructeur d'objets de classe point.Cercle
     */
    public Cercle()
    {
        super("Cercle",20);
        // initialisation des variables d'instance
        centre = new Point();
        r = 1;
    }

    public Point getCentre() {
        return centre;
    }

    public Cercle(Point p, float r) {
        super("Cercle",20);
        this.centre = p;
        this.r = r;
    }

    public void setCentre (Point centre)
    {
        this.centre = centre;
    }

    public void deplacerCercle (float deplacementX, float deplacementY) {
        centre.deplacerPoint(deplacementX,deplacementY);
    }

    public int getNoteInterrogation (Point ancienCentre,float deplacementX, float deplacementY) {
        if (ancienCentre.getX()+deplacementX==centre.getX() && ancienCentre.getY()+deplacementY==centre.getY())
            return 20;
        else
            return 0;
    }
}
