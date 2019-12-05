package ecole;
import org.junit.Assert;
import org.junit.Test;
import point.Courbe;
import point.Point;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;
import org.junit.Test;
import point.Courbe;
import point.Point;

import java.util.ArrayList;
import java.util.List;


import static org.junit.Assert.assertEquals;

public class CoursTest {

    private boolean isInList (Chapitre chapitre, List<Chapitre> chapitres)
    {
        for (Chapitre chapitre1:chapitres)
        {
            if (chapitre.equals(chapitre1))
                return true;
        }
        return false;
    }
    @Test
    public void testAjouterChapitre(){
        Cours cours = new Cours.Builder("Test",20).build();
        Chapitre ch0 = new Chapitre("ch0",19);
        cours.addChapitre(ch0);
        List<Chapitre> chapitres = cours.getChapitres();
        assertEquals(1, chapitres.size());
        assertTrue(isInList(ch0, chapitres));
        Chapitre ch1 = new Chapitre("ch1",2);
        cours.addChapitre(ch1);
        chapitres = cours.getChapitres();
        assertEquals(1,chapitres.size());
        assertFalse(isInList(ch1, chapitres));
        Chapitre ch2 = null;
        cours.addChapitre(ch2);
        chapitres = cours.getChapitres();
        assertEquals(1,chapitres.size());
    }



}
