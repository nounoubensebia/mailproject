package ecole;
import org.junit.Test;
import point.Courbe;
import point.Point;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CoursTest {

    @Test
    private void addChapitretest(Chapitre ch){

        Cours anglais=new Cours(new Ecole());

    }
    private boolean comparerList(ArrayList<Chapitre> chapitres1, ArrayList<Chapitre> chapitres2){
        return chapitres1.containsAll(chapitres2);
    }

}
