package controlStructures.selectionStructure;

public class IfThenElse {
    public static void main(String[] args) {
        int a = 20;
        int b = 4;
        int c = 6;
        int d = 1;

        // If b greater or equal to 3 then result 111 if not then a divide b
        int e = (b>=3) ? 111:(a/b);
        int f = (d<=1) ? 0:(c/b);
        int g = (d==0) ? 0:(c/b);

        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println("g = " + g);
     }
}
