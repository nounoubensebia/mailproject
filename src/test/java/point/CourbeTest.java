package point;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CourbeTest {

    @Test
    public void deplacerCourbe() {
        Point p1 = new Point(3, 2);
        Point p2 = new Point(4, 5);
        Point p3 = new Point(6, 1);

        ArrayList<Point> points = getPoints(p1, p2, p3);

        Courbe courbe = new Courbe(points);
        courbe.moveCourbe(3, 2);

        //test
        Point pt1 = courbe.getPoints().get(0);
        Point pt2 = courbe.getPoints().get(1);
        Point pt3 = courbe.getPoints().get(2);

        //test point 1
        assertEquals(pt1.getX(), 3 + 3, 0.001);
        assertEquals(pt1.getY(), 2 + 2, 0.001);
        //test point2
        assertEquals(pt2.getX(), 4 + 3, 0.001);
        assertEquals(pt2.getY(), 5 + 2, 0.001);
        //test point3
        assertEquals(pt3.getX(), 6 + 3, 0.001);
        assertEquals(pt3.getY(), 1 + 2, 0.001);

    }

    private ArrayList<Point> getPoints(Point p1, Point p2, Point p3) {
        ArrayList<Point> points = new ArrayList<Point>();
        points.add(p1);
        points.add(p2);
        points.add(p3);
        return points;
    }

}
