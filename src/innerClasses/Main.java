package innerClasses;
// Second option for multiple inheritance in Java after Interfaces
// Creating class in already existed class
//
// 3 groups:
// Inner Classes : Sup-sub (Nested classes)
// Local Classes :
// Anonymous :
//
// Java will not allow "private-protected" access modifiers for classes.
// But allows for inner classes

class Outer{
    // simple nested class
    class Inner{
        public void show(){
            System.out.println("In nested class method");
        }
    }
}
public class Main {

    public static void main(String[] args) {
        // Creating from NESTED Class
        Outer.Inner yeni = new Outer().new Inner();
        // Way to reach NESTED Class
        yeni.show();
    }

}
