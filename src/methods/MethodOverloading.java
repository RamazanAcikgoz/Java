package methods;

public class MethodOverloading {
    public static void main(String[] args) {
        int firstValue = 8;
        int secondValue = 10;
        double firstNumber = 8.5;
        double secondNumber = 10.5;

        int result = letMeCheck(firstValue,secondValue);
        double resultDouble = letMeCheck(firstNumber,secondNumber);
        System.out.println("For Integer : " + result);
        System.out.println("For Double : " + resultDouble);

    }
    public static int letMeCheck(int x, int y){
        int result;
        if(x>y){
            result = x - y;
        }else{
            result = y - x;
        }
        return result;
    }
    public static double letMeCheck(double x,double y){
        double result;
        if(x>y){
            result = x - y;
        }else{
            result = y - x;
        }
        return result;
    }
}
