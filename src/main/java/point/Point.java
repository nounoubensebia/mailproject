package point;

import ecole.Chapitre;

public class Point extends Chapitre {
    private float x;
    private float y;

    public Point(String nomCh,int volumeHorraire)
    {
        // initialisation des variables d'instance
        super(nomCh,volumeHorraire);
        x = 0;
        y = 0;
    }

    public Point(String nomCh, int volumeHorraire,float x, float y) {
        super(nomCh,volumeHorraire);
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void deplacerPoint (float deplacementX, float deplacementY) {
        this.x = this.x + deplacementX;
        this.y = this.y + deplacementY;
    }

    public static float distance (Point p1,Point p2)
    {
        return (float)Math.sqrt(Math.pow(p1.x-p2.x,2) +
                Math.pow(p1.y-p2.y,2));
    }

    public static boolean compare (Point p1, Point p2)
    {
        return (p1.x==p2.x&&p1.y==p2.y);
    }
}
