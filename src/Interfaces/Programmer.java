package Interfaces;


public class Programmer implements Worker {
    @Override
    public void calls() {
        System.out.println("Programmer is working");
    }
}
