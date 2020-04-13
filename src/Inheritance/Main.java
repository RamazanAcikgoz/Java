package Inheritance;


public class Main {
    public static void main(String[] args) {
        Personal personOne = new Personal("Ramazan","Acikgoz",29);
        System.out.println(personOne.getIdInfo());
        System.out.println(personOne.toString());

        Student studentOne = new Student("Hasan","Yuzgec",22,296);
        System.out.println(studentOne.getIdInfo());
        System.out.println(studentOne.toString());

        // Differences

    }
}
