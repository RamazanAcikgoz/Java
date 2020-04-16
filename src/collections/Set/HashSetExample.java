package collections.Set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
        // Example 1 :

        HashSet<String> newHash = new HashSet<>();
        newHash.add("RA");
        newHash.add("MA");
        newHash.add("ZAN");
        newHash.add("ALEX");
        newHash.add("EREN");

        Iterator<String> itr = newHash.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        // Example 2 :

        String[] names = {"RA","Marta","Alex","RA","Marta"};
        HashSet<String> nameGroup = new HashSet<>();

        for(String s : names){
            if(nameGroup.add(s)){
                System.out.println(s + " added to HashSet...");
            }else{
                System.out.println(s + " Failed!");
            }
        }
        System.out.println();
        System.out.println("Collection size : " + nameGroup.size());

    }
}
