package ecole;

class MoyenneMath implements CalculMoyenneStrategy {
    private float td;
    private float tp;
    private float exam;

    public MoyenneMath(float td, float tp, float exam){
        this.td=td;
        this.tp=tp;
        this.exam=exam;
    }
    public float CalculerMoyenne(float td, float tp, float exam) {
       return (float) (td*02+tp*0.2+exam*0.6);
    }
}
