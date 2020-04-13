package polymoprhism;

public class Main {
    public static void main(String[] args) {

        // Person's information is able to reach from employee
        Main test = new Main();
        Employee employee = new Employee();
        employee.setName("Gregory");
        employee.setSurname("House");
        employee.setDateOfBirthYear(1991);
        employee.setIdNo("11111111110");
        employee.setJobTittle("Junior Java Developer");
        employee.setSalary(100000L);

        test.writer(employee);
    }

        public void writer (Person person){
            System.out.println(person.toString());
        }
}
