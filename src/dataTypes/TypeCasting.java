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

        String s1 = "12";
        String s2 = "18";

        int stringCasting = Integer.valueOf(s1);
        int stringCastingTwo = Integer.parseInt(s2);
        System.out.println("String value after casting : " + stringCasting);
        System.out.println("Second string value after casting : " + stringCastingTwo);
    }
}
