package methods;

public class MethodWithMultiVariable {
    public static void main(String[] args) {
        sumOfNumber(2,3,5,8,7,4);
    }
    public static void sumOfNumber(int... x){
        int sum = 0;

        for(int number : x){
            sum += number;
        }
        System.out.println("Sum of numbers : " + sum);
    }
}
