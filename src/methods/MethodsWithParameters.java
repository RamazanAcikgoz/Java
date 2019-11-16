package methods;

public class MethodsWithParameters {
    public static void main(String[] args) {
        int firstValue = 66;
        int secondValue = 44;
        int result = letMeCheck(firstValue,secondValue);

        System.out.println(result);

        System.out.println(letMeCheck(8,7));

    }
    public static int letMeCheck(int x, int y){
        int bigValue;
        if(x>y){
            bigValue = x - y;
        }else{
            bigValue = y - x;
        }
        return bigValue;
    }
}
