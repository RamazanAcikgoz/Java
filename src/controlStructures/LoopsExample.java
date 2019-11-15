package controlStructures;

import java.util.Scanner;

public class LoopsExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number;

        System.out.println("Please Enter Loop number : ");
        number = scan.nextInt();

        //for (int i = 1; i<=number;i++){
         //   System.out.println("Loop's time : " + i);
       //}

        //while (number>0){
          //  System.out.println("Loop's time : " + number);
            //number--;
        //}

        do{
            System.out.println("Loop's time : " + number);
            number--;
        }while (number>0);
    }
}
