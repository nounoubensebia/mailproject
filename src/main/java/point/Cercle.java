package point;

public class Cercle {
    private Point p;
    private float r;

    /**
     * Constructeur d'objets de classe point.Cercle
     */
    public Cercle()
    {
        // initialisation des variables d'instance
        p = new Point();
        r = 1;
    }

    public Point getP() {
        return p;
    }

    public Cercle(Point p, float r) {
        this.p = p;
        this.r = r;
    }

    public void deplacerCercle (float deplacementX, float deplacementY) {
        p.deplacerPoint(deplacementX,deplacementY);
    }
}
