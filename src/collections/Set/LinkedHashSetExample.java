package collections.Set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        // Example 1 :

        LinkedHashSet<String> newLinked = new LinkedHashSet<>();
        newLinked.add("RA");
        newLinked.add("MA");
        newLinked.add("Z");
        newLinked.add("ALEXander");
        newLinked.add("ERENowski");

        Iterator<String> itr = newLinked.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        // Example 2 :
        // Foreach and Iterator outputs are different normally :
        // Cause of LinkedHashSet outputs are in the same order

        String[] arr = {"Ali","Veli","Deli","Ayse","Fatma","Duriye","Nuriye"};
        LinkedHashSet<String> arrLinked = new LinkedHashSet<>();

        for(String s : arr){
            boolean add = arrLinked.add(s);
            System.out.println(s + " ");
        }
        System.out.println();

        Iterator<String> litr = arrLinked.iterator();
        while(litr.hasNext()){
            System.out.println(litr.next()+ " ");
        }

    }
}
