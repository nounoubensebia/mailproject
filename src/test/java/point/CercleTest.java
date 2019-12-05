package point;

import org.junit.Assert;
import org.junit.Test;

public class CercleTest {

    @Test
    public void testDeplacerCercle()
    {
        Cercle cercle = new Cercle(new Point(1,2),3);
        cercle.deplacerCercle(3,4);
        Assert.assertEquals(4,cercle.getP().getX(),0.00001);
        Assert.assertEquals(6,cercle.getP().getY(),0.00001);
    }

}
