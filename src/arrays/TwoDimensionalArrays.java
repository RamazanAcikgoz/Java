package arrays;

public class TwoDimensionalArrays {
    public static void main(String[] args) {
        int [][] table = new int[5][4];

        for(int row = 0; row<table.length;row++){
            for(int column = 0; column<table[row].length;column++){
                table[row][column] = (int) (Math.random()*100);
            }
        }

        for(int row = 0; row<table.length;row++){
            for(int column = 0; column<table[row].length; column++){
                System.out.print(table[row][column] + " ");
            }
            System.out.println();
        }
    }
}
