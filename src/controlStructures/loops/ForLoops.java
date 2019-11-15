package controlStructures.loops;

public class ForLoops {
    public static void main(String[] args) {
        int number = 10;

        for(int i = 1; i<=10;i++){
            System.out.println("For loop time : " + i);
        }
        for(int x = 0, y = 0; x<5; x++,y++){
            x *=y;
            System.out.println("x = " + x + " y = " + y);
        }
    }
}
