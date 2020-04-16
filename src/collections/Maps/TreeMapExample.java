package collections.Maps;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

//
// SORTEDMAP' den turetilmistir. Sirali ekleme saglar fakat guncellemelerde yavas kalir
// Esleme tablosundaki anahtari sira ile tutar. Bu sira tablodaki anahtarlarin karsilastirilmasi ile olusur
// Yani kucukten buyuge gelir. (1,2,3,4) (a,b,c,d) ... gibi
//
//
// Java TreeMap contains values based on the key. It implements the NavigableMap interface and extends AbstractMap class.
// Java TreeMap contains only unique elements.
// Java TreeMap cannot have a null key but can have multiple null values.
// Java TreeMap is non synchronized.
// Java TreeMap maintains ascending order.
public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer,String> map=new TreeMap<Integer,String>();
        map.put(100,"Amit");
        map.put(102,"Ravi");
        map.put(101,"Vijay");
        map.put(103,"Rahul");

        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        System.out.println();
        map.remove(102);
        System.out.println("After invoking remove() method");
        for(Map.Entry m:map.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }
        System.out.println();

        NavigableMap<Integer,String> nMap=new TreeMap<Integer,String>();
        nMap.put(100,"Amit");
        nMap.put(102,"Ravi");
        nMap.put(101,"Vijay");
        nMap.put(103,"Rahul");
        //Maintains descending order
        System.out.println("descendingMap: "+nMap.descendingMap());
        //Returns key-value pairs whose keys are less than or equal to the specified key.
        System.out.println("headMap: "+nMap.headMap(102,true));
        //Returns key-value pairs whose keys are greater than or equal to the specified key.
        System.out.println("tailMap: "+nMap.tailMap(102,true));
        //Returns key-value pairs exists in between the specified key.
        System.out.println("subMap: "+nMap.subMap(100, false, 102, true));
    }
}
