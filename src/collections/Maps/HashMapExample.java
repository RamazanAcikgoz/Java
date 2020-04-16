package collections.Maps;

import java.util.HashMap;
import java.util.Map;//
// Hizli, arama ve guncelleme yapar. Karisik eslesme denilebilir.
// Eleman ekleme, cikarma ve ya anahtari verilen elemani tablo uzerinde bulmada etkilidir
//
//
//          HashMap class Parameters
// Let's see the Parameters for java.util.HashMap class.
//
// K: It is the type of keys maintained by this map.
// V: It is the type of mapped values.

public class HashMapExample {
    public static void main(String[] args) {

        HashMap<Integer,String> hm = new HashMap<>();
        System.out.println("Initial list of elements " + hm);
        hm.put(6,"Ramazan");
        hm.put(2,"Alex");
        hm.put(1,"Marta");
        System.out.println();
        System.out.println("After invoking put() method : " + hm);
        for (Map.Entry m :hm.entrySet()){
            System.out.println(m.getKey()+ " " + m.getValue());
        }
        System.out.println();
        hm.putIfAbsent(3, "Galatasaray");
        System.out.println("After invoking putIfAbsent() method ");
        for(Map.Entry m:hm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

        HashMap<Integer,String> map=new HashMap<Integer,String>();
        map.put(104,"Ravi");
        map.putAll(hm);
        System.out.println();
        System.out.println("After invoking putAll() method ");
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        System.out.println();

        System.out.println("Updated list of elements: "+map);
        //value-based removal
        map.remove(104);
        System.out.println("Updated list of elements: "+map);
        //key-value pair based removal
        map.remove(3, "Galatasaray");
        System.out.println("Updated list of elements: "+map);
    }
}
