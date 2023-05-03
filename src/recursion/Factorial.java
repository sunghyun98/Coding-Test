package recursion;

/**
 * 팩토리얼 n!
 */
public class Factorial {
    public static void main(String[] args) {
        System.out.println(fibonacci(10));
        System.out.println(factorial(5));
    }

    public static int fibonacci(int n){
        if (n<2){
            return n;
        }else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
    public static int factorial(int n){
        if (n<2){
            return 1;
        }else {
            return n * factorial(n-1);
        }
    }
}
