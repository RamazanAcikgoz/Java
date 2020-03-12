package objectOriented;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Rectangle rectangleTwo = new Rectangle();
        // As we see here without access modifiers we cannot protect data field
        rectangle.height = 12;
        //rectangleTwo.height = 8;
        rectangleTwo.height = -8;

        System.out.println("Calculation : " + rectangle.rectangleCalc());
        System.out.println("Calculation Two : " + rectangleTwo.rectangleCalc());

        RectangleTwo rectangleThree = new RectangleTwo(6,8);

        System.out.println("Calculation Three : " + rectangleThree.calRec());

    }
}
