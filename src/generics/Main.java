package generics;

public class Main {
    public static void main(String[] args) {
        StringArrWriter stWriter = new StringArrWriter();
        CharacterArrWriter chWriter = new CharacterArrWriter();
        IntegerArrWriter inWriter = new IntegerArrWriter();
        DoubleArrWriter doWriter = new DoubleArrWriter();

        String [] sArr ={"RA","MWA","AEA"};
        Character[] cArr = {'A','R','M'};
        Integer[] iArr = {1,2,3};
        Double [] dArr = {1.0,2.0,3.0};

        stWriter.arrWrite(sArr);
        chWriter.arrWrite(cArr);
        inWriter.arrWrite(iArr);
        doWriter.arrWrite(dArr);

        //As we saw above without Generics it seems like that. We need 4 different class for those operations

        // Let's see how it is seems with generics below:

        GenericClass<String> stWriterTwo = new GenericClass<>();
        GenericClass<Character> chWriterTwo = new GenericClass<>();
        GenericClass<Integer> inWriterTwo = new GenericClass<>();
        GenericClass<Double> doWriterTwo = new GenericClass<>();

        stWriterTwo.arrWriter(sArr);
        chWriterTwo.arrWriter(cArr);
        inWriterTwo.arrWriter(iArr);
        doWriterTwo.arrWriter(dArr);

    }
    // Generic method example
    /*
    public static <Genel>void arrWriterMethod(Genel[] arr){
        for(Genel g : arr){
            System.out.println(g + " ");
        }
        System.out.println();
    }
     */
}
