package Interfaces;

public class Director extends Manager {
    @Override
    public void calls() {
        System.out.println("Director is working");
    }
    public void manageMeeting(){
        System.out.println("Director managing meetings");
    }
}
