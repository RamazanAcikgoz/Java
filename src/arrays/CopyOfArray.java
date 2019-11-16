package arrays;

public class CopyOfArray {
    public static void main(String[] args) {
        int[] anArray = {1,2,3,4};
        int[] anArrayTwo = new int[anArray.length];

        for(int i = 0; i<anArray.length;i++){
            anArrayTwo[i] = anArray[i];
        }

        for(int j = 0; j<anArrayTwo.length;j++){
            System.out.println(anArrayTwo[j]);
        }

        int[] dizi1 = {8,7,6,5,4};
        int[] dizi2 = new int[dizi1.length];

        System.arraycopy(dizi1,0,dizi2,0,5);

        for(int x = 0; x<dizi2.length;x++){
            System.out.println(dizi2[x]);
        }
    }
}
