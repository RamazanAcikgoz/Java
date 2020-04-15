package innerClasses;

public class InnerClasses {

    public static void main(String[] args) {

        InnerClasses.A.B.C.D nesne = new InnerClasses().new A().new B().new C().new D();
        nesne.show();

    }

    public class A {

        public class B {

            public class C {
                public class D {
                    //D Area
                    public void show(){
                        System.out.println("I am Class D!");
                    }
                }
                //C Area
            }
            //B Area
        }
        //A Area
    }
}