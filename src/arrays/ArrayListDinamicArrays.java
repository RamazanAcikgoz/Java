package arrays;

import java.util.ArrayList;

public class ArrayListDinamicArrays {
    public static void main(String[] args) {
        ArrayList<String> nameBook = new ArrayList<String>();
        nameBook.add("Ranczo");
        nameBook.add("Marta");
        nameBook.add("Alex");
        nameBook.add(1,"Acikgoz");
        nameBook.add(3,"Acikgoz");
        nameBook.add(5,"Acikgoz");
        nameBook.add("Acikgoz Family");

        System.out.println("Size of Array : " + nameBook.size());

        for(int i = 0; i<nameBook.size();i++){
            System.out.println("Index : " + i + " : " + nameBook.get(i));
        }
    }
}
