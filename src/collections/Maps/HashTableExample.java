package collections.Maps;

import java.util.Hashtable;
import java.util.Map;

// A Hashtable is an array of a list. Each list is known as a bucket.
// The position of the bucket is identified by calling the hashcode() method. A Hashtable contains values based on the key.
// Java Hashtable class contains unique elements.
// Java Hashtable class doesn't allow null key or value.
// Java Hashtable class is synchronized.
// The initial default capacity of Hashtable class is 11 whereas loadFactor is 0.75.
public class HashTableExample {
    public static void main(String[] args) {
        Hashtable<Integer,String> tableHash=new Hashtable<Integer,String>();

        tableHash.put(100,"Khan");
        tableHash.put(102,"Dayi");
        tableHash.put(101,"Tamiz");
        tableHash.put(103,"Ezhel");

        for(Map.Entry m:tableHash.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

        System.out.println();
        //Here, we specify the if and else statement as arguments of the method
        System.out.println(tableHash.getOrDefault(101, "Not Found"));
        System.out.println(tableHash.getOrDefault(105, "Not Found"));
        System.out.println("Initial Map: "+tableHash);
        //Inserts, as the specified pair is unique
        tableHash.putIfAbsent(104,"Gaurav");
        System.out.println("Updated Map: "+tableHash);
        //Returns the current value, as the specified pair already exist
        tableHash.putIfAbsent(101,"Khan");
        System.out.println("Updated Map: "+tableHash);
    }
}
