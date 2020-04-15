package generics;

public class CharacterArrWriter {
    public void arrWrite(Character[] arr){
        for(Character x : arr){
            System.out.println(x + " ");
        }
        System.out.println();
    }
}
