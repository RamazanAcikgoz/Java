package collections.List;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {
    public static void main(String[] args) {
        // Example 1 :

        LinkedList<String> newList = new LinkedList<>();
        newList.add("RA");
        newList.add("MWA");
        newList.add("AEA");

        Iterator itr = newList.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println();
        System.out.println();

        // Example 2 :

        LinkedList<String> liste = new LinkedList<>();
        liste.add("1");
        liste.add("2");
        liste.add("3");
        liste.add("4");
        liste.add("5");
        liste.add("6");
        liste.add(3,"33");

        System.out.println("List : " + liste);
        System.out.println();

        System.out.println("First Element : " + liste.getFirst());
        liste.addFirst("001");
        System.out.println("Last Element : " + liste.removeLast());
        System.out.println();

        ListIterator<String> itrN = liste.listIterator();
        while(itrN.hasNext()){
            System.out.print(itrN.next() + ",");
        }
        System.out.println();
        System.out.println();

        itrN = liste.listIterator(liste.size());
        while (itrN.hasPrevious()){
            System.out.print(itrN.previous() + ",");
        }


    }
}
