package absraction;

public class Main {
    public static void main(String[] args) {
        FirstEmployee hasan = new FirstEmployee();
        hasan.setID(2);
        hasan.setName("Hasan");
        hasan.setSurname("Yuzgec");
        hasan.setJobTitle("Junior JavaScript Developer");

        System.out.println(hasan.getName()+ " " + hasan.getSurname());
        System.out.println(hasan.getJobTitle());
        System.out.println(hasan.calculateSalary());

        SecondEmployee ra = new SecondEmployee();
        ra.setID(6);
        ra.setName("Ramazan");
        ra.setSurname("Acikgoz");
        ra.setJobTitle("Junior Java Developer");

        System.out.println(ra.getName()+ " " + ra.getSurname());
        System.out.println(ra.getJobTitle());
        System.out.println(ra.calculateSalary());
    }
}
