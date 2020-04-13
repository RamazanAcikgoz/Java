package absraction;
// FirstEmployee class will be extends from AbstractEmployee and with inheritance could use calculateSalary by own algorithm

public class FirstEmployee extends AbstractEmployee {
    private static final int CONST_ALES = 2;
    private static final float CONST_UNI = 0.3f;
    private static final int CONST = 10000;

    @Override
    public float calculateSalary(){
        return CONST * (CONST_ALES*CONST_UNI);
    }

}
