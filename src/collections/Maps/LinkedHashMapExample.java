package collections.Maps;

import java.util.LinkedHashMap;
import java.util.Map;

//
// Sirali eslesme denilir. Elemanlarin eklenmesinin sirali olmasini saglar
// HashMapExample kadar hizlidir
//
// Java LinkedHashMapExample contains values based on the key.
// Java LinkedHashMapExample contains unique elements.
// Java LinkedHashMapExample may have one null key and multiple null values.
// Java LinkedHashMapExample is non synchronized.
// Java LinkedHashMapExample maintains insertion order.
// The initial default capacity of Java HashMap class is 16 with a load factor of 0.75
//
//
public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> linkedHM=new LinkedHashMap<Integer,String>();

        linkedHM.put(100,"Amit");
        linkedHM.put(101,"Vijay");
        linkedHM.put(102,"Rahul");

        for(Map.Entry m:linkedHM.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

        System.out.println("Keys: "+linkedHM.keySet());
        //Fetching value
        System.out.println("Values: "+linkedHM.values());
        //Fetching key-value pair
        System.out.println("Key-Value pairs: "+linkedHM.entrySet());
        linkedHM.remove(102);
        System.out.println("After invoking remove() method: "+linkedHM);
    }
}
