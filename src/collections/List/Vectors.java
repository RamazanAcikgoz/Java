package collections.List;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Vectors {
    public static void main(String[] args) {
        // Example 1 :


        Vector<String> newVec = new Vector<>();
        newVec.add("Ramazan");
        newVec.add("Hasan");
        newVec.add("Altan");
        newVec.add("Marcin");
        newVec.add("Sebo");
        newVec.add("Kajetan");

        Iterator<String> itr = newVec.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next() + ",");
        }

        // Example 2 :

        Vector<String> v = new Vector<>();
        v.add("1");
        v.add("2");
        v.add("3");
        v.add("4");
        v.add("5");
        v.add("6");
        v.add(3,"Gercek 3");

        System.out.println("First Element : " + v.firstElement());
        System.out.println("Last Element : " + v.lastElement());
        System.out.println("Vector's size : " + v.size());
        System.out.println("Vector's Elements : " + v);

        System.out.println();
        System.out.println();

        Enumeration e = v.elements();
        while (e.hasMoreElements()){
            System.out.println("Vector's Elements : " + e.nextElement());
        }

    }
}
