package controlStructures.selectionStructure;

public class ElseIfStatement {
    public static void main(String[] args) {
        int point = 85;
        char result;

        if(point>=85){
            result = 'A';
        }else if(point<=85 && point>=70){
            result = 'B';
        }else if(point<=69){
            result = 'C';
        }else{
            result ='D';
        }
        System.out.println("Result : " + result);
    }
}
