package arrays;

public class Arrays  {
    public static void main(String[] args) {
        int[] aNewArray = new int[6];

        aNewArray[0] = 6;
        aNewArray[1] = 12;
        aNewArray[2] = 24;
        aNewArray[3] = 48;
        aNewArray[4] = 96;
        aNewArray[5] = 192;

        for(int i = 0; i<aNewArray.length; i++){
            System.out.println("Index : " + i + " Value : " + aNewArray[i]);
        }

        int[] aNewArrayTwo = {1,2,4,8,16,32,64,128,256,512};

        for(int j = 0; j<aNewArrayTwo.length;j++){
            System.out.println("Index : " + j + " Value : " + aNewArrayTwo[j]);
        }
    }
}
