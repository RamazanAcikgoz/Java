package innerClasses;

// outer class
class OuterClassTwo
{
    // static member
    static int outer_x = 10;

    // instance(non-static) member
    int outer_y = 20;

    // private member
    private int outer_private = 30;

    // inner class
    class InnerClassTwo
    {
        void display()
        {
            // can access static member of outer class
            System.out.println("outer_x = " + outer_x);

            // can also access non-static member of outer class
            System.out.println("outer_y = " + outer_y);

            // can also access private member of outer class
            System.out.println("outer_private = " + outer_private);

        }
    }
}

public class InnerClassTwo {
    public static void main(String[] args) {
        // accessing an inner class
        OuterClassTwo outerObject = new OuterClassTwo();
        OuterClassTwo.InnerClassTwo innerObject = outerObject.new InnerClassTwo();

        innerObject.display();
    }
}
