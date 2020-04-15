package innerClasses;


class OuterClass{
    // Static member
    static int outerMember_x = 10;
    // instance (non-static) member
    int outerMemberTwo_y = 20;
    // privare member
    private static int outerMemberThree_z = 30;

    // STATIC NESTED CLASS
    static class StaticNestedClasses{
        void display(){
            // Can access static member of OUTER CLASSES
            System.out.println("Outer x : " + outerMember_x);
            // Can access and display private member as well
            System.out.println("Outer z : " + outerMemberThree_z);

            // The following statement will give compilation error
            // as static nested class cannot directly access non-static member
            // System.out.println("Outer y = " + outerMemberTwo_y);
        }
    }
}
public class StaticNestedClass {
    public static void main(String[] args) {
        OuterClass.StaticNestedClasses nestedObject = new OuterClass.StaticNestedClasses();
        nestedObject.display();
    }

}
