package dataTypes;

public class TypeCasting {
    public static void main(String[] args) {
        float floatNumber = 3.23f;
        double doubleNumber = 6.6;
        System.out.println("Float value : " + floatNumber + " value number : " + doubleNumber);

        int intNumber = (int) floatNumber;
        System.out.println("Float value after casting : " + intNumber);

        int intNumberTwo = (int) doubleNumber;
        System.out.println("Double value after casting : " + intNumberTwo);

        int intNumberThree = 23;
        double doubleNumberTwo = (double) intNumberThree;
        System.out.println("Int value after casting " + doubleNumberTwo);
    }
}
