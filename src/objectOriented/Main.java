package objectOriented;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Rectangle rectangleTwo = new Rectangle();
        rectangle.height = 12;
        rectangleTwo.height = 8;

        System.out.println("Calculation : " + rectangle.rectangleCalc());
        System.out.println("Calculation Two : " + rectangleTwo.rectangleCalc());

    }
}
