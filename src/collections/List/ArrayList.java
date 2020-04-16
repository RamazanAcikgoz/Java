package collections.List;
import java.util.*;


public class ArrayList {
//
// It uses a dynamic array to store the duplicate element of different data types.
// The ArrayList class maintains the insertion order and is non-synchronized.
// The elements stored in the ArrayList class can be randomly accessed
//
// Bu sinif elemanlari boyutu degisen dinamik dizilerde tutmaktadir. Tutulan elemanlara rastgele erisilmek istendiginde kullanilir.
//
    public static void main(String[] args) {

        String[] name ={"Ali","Veli","Deli","Ayse","Fatma","Duriye","Nuriye","Deli"};
        String[] surname = {"Aliye","Veli","Deliye","Aysegul","Nuriye"};

        ArrayList<String> nameList = new ArrayList<String>();
        ArrayList<String> surnameList = new ArrayList<String>();


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
