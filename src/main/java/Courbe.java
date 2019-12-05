import java.util.List;

public class Courbe {
    private List<Point> points;

    public Courbe(List<Point> points) {
        this.points = points;
    }

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    public void moveCourbe(float dX, float dY)
    {
        for (Point p:points)
        {
            p.deplacerPoint(dX,dY);
        }
    }
}
