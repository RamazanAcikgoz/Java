package multithreading;

public class Counter implements Runnable {
    private Person person;
    private String personName;
    Thread thread;

    public Counter(Person person,String personName){
        this.person = person;
        this.personName = personName;
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run(){
        synchronized (person){
            person.personCountDown(personName);
        }
    }
}
