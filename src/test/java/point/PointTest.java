package point;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    private Point point1;
    private Cercle cercle1;
    /**
     * Constructeur de la classe-test TestPoint
     */
    public PointTest()
    {
    }

    /**
     * Met en place les engagements.
     *
     * Méthode appelée avant chaque appel de méthode de test.
     */
    @Before
    public void setUp() // throws java.lang.Exception
    {
        point1 = new Point();
        cercle1 = new Cercle();
    }

    /**
     * Supprime les engagements
     *
     * Méthode appelée après chaque appel de méthode de test.
     */
    @After
    public void tearDown() // throws java.lang.Exception
    {
        //Libérez ici les ressources engagées par setUp()
    }


    @Test
    public void testDeplacerPoint() {
        Point point1 = new Point();
        point1.setX(2);
        point1.setY(3);
        point1.deplacerPoint(1,2);
        assertEquals(point1.getX(),2+1,0.001);
        assertEquals(point1.getY(),3+2,0.001);
    }

    @Test
    public void testDistance() {
        Point p1 = new Point(1,2);
        Point p2 = new Point(1,3);
        float dist = Point.distance(p1,p2);
        assertEquals(dist,1,0.0001);
    }

    @Test
    public void testComparer()
    {
        Point p1 = new Point(1,2);
        Point p2 = new Point(1,2);
        Point p3 = new Point(2,3);
        assertTrue(Point.compare(p1, p2));
        assertFalse(Point.compare(p1,p3));
    }

}
