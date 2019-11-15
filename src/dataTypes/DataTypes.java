package dataTypes;

public class DataTypes {
    public static void main(String[] args) {
        // Just for holding unicode character value. 16 bit / 2 bytes
        char charCharacter = 'R';
        // Could hold between -128 and 127. 8 bit / 1 byte
        byte byteNumber = 15;
        // Between -32768 and 32767. 16 bit / 2 bytes
        short shortNumber = 6;
        // 32 bit / 4 bytes
        int intNumber = 8;
        // 64 bit / 8 bytes
        long longNumber = 1234567890;
        // After comma could hold 7 digit. For decimal numbers. 32 bit / 4 bytes
        float floatNumber = 1.1234567f;
        // True or false. Null value = false. 1 bit
        boolean isTrue = false;

        String stringName = "Ranczo";

        System.out.println("Character : " + charCharacter);
        System.out.println("Byte : " + byteNumber);
        System.out.println("Short : " + shortNumber);
        System.out.println("Int : " + intNumber);
        System.out.println("Long : " + longNumber);
        System.out.println("Float : " + floatNumber);
        System.out.println("String : " + stringName);
        System.out.println("Boolean : " + isTrue);
    }
}
