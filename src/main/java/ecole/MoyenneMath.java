package ecole;

public class MoyenneMath implements CalculMoyenneStrategy {


    public MoyenneMath(){

    }
    public float calculerMoyenne(float td, float tp, float exam) {
       return (float) (td*0.2+tp*0.2+exam*0.6);
    }
}
