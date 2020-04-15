package generics;

public class IntegerArrWriter {
    public void arrWrite(Integer[] arr){
        for(Integer x : arr){
            System.out.println(x + " ");
        }
        System.out.println();
    }
}
