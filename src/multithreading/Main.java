package multithreading;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        Counter firstPerson = new Counter(person, "Ramazan");
        Counter secondPerson = new Counter(person,"Hasan");
        Counter thirdPerson = new Counter(person,"Marjin");

        try{
            firstPerson.thread.join();
            secondPerson.thread.join();
            thirdPerson.thread.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
