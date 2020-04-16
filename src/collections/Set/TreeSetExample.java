package collections.Set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // Example 1 :

        TreeSet<String> newTree = new TreeSet<>();
        newTree.add("Hima");
        newTree.add("Laya");
        newTree.add("Kar");
        newTree.add("Pat");
        newTree.add("Mara");
        newTree.add("Dona");

        Iterator<String> itr= newTree.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println();

        // Example 2 :

        String[] tArr = {"Ali","Veli","Deli","Ayse","Fatma","Duriye","Nuriye"};
        TreeSet<String> arrTree = new TreeSet<>();

        for(String s : tArr){
            arrTree.add(s);
            System.out.println(s + " ");
        }
        System.out.println();

        Iterator<String> tIR = arrTree.iterator();
        while(tIR.hasNext()){
            System.out.println(tIR.next()+ " ");
        }

    }
}
