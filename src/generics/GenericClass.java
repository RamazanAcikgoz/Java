package generics;
// We create just one generic class
// We use <Name> keywords
// Generics making operations just on reference types
public class GenericClass <Genel> {
    public void arrWriter(Genel[] arr){
        for(Genel g : arr){
            System.out.println(g + " ");
        }
        System.out.println();
    }
}
