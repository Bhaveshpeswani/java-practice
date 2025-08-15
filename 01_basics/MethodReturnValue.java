public class MethodReturnValue {

    static int value (int x){
        System.out.println("Calculating the value of x: " + x);
        return x * 5;
    }

    public static void main(String[] args){
        int result = value(1);
        System.out.println("Result is :  " + result);
    }
}
