package absraction;
// And let's see how we will implement own calculateSalary Algorithm
public class SecondEmployee extends AbstractEmployee {
    private static final int CONST_ALES = 2;
    private static final int CONST = 10000;

    @Override
    public float calculateSalary(){
        return CONST *(CONST_ALES * 0.75f);
    }
}
