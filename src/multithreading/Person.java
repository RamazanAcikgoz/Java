package multithreading;

public class Person {
    public void personCountDown(String name){
        System.out.println(name + " is starting the countdown...");
        for(int i = 6; i>0 ; i--){
            System.out.println(i);
            try{
                Thread.sleep(600);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("CountDown is over! \n");
    }
}
