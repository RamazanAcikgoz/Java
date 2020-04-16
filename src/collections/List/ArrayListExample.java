package collections.List;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {

        // Example 1 :

        ArrayList<String> newList = new ArrayList<>();
        newList.add("Ramazan");
        newList.add("Marta");
        newList.add("Alex");

        Iterator itr = newList.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }





        // Example 2 :

        String[] name ={"Ali","Veli","Deli","Ayse","Fatma","Duriye","Nuriye","Deli"};
        String[] surname = {"Aliye","Veli","Deliye","Aysegul","Nuriye"};

        ArrayList<String> nameList = new ArrayList<>();
        ArrayList<String> surnameList = new ArrayList<>();


        for(String s : name){
            nameList.add(s);
        }
        System.out.println();
        for (String s : surname){
            surnameList.add(s);
        }

        Iterator<String> stringIterator = nameList.listIterator();
        while (stringIterator.hasNext()){
            if(surnameList.contains(stringIterator.next())){
                stringIterator.remove();
            }
        }
        System.out.println("Last version of ArrayList : ");
        for (String s : nameList){
            System.out.println(s + " ");
        }
    }
}
