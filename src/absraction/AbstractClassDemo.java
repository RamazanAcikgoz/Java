package absraction;
// Abstraction is one of the concept of OOP
// Main purpose is gathering classes under one roof which are somehow connected with logic way
// They could have or not have empty or non empty methods
// ABSTRACT methods does not have bodies!
// We can create with abstract keyword! If there is method with this keyword so Main class should be abstract too
// If one class will extends from abstract class then they should implement all methods from abstract class
public abstract class AbstractClassDemo {
    public abstract int calculateSum(int a,int b);

    public double calculateDivide(int a,int b){
        double result = a/b;
        System.out.println("Result : " + result);
        return result;
    }
}
