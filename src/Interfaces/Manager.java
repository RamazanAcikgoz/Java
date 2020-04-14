package Interfaces;

public class Manager implements Worker {
    @Override
    public void calls() {
        System.out.println("Manager is working");
    }
}
