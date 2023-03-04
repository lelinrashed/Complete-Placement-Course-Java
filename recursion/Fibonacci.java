package recursion;

public class Fibonacci {
    public static void printFib(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        int next = a + b;
        System.out.println(next);
        printFib(b, next, n - 1);
    }

    public static void main(String[] args) {
        // print fibonacci series
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        int n = 9;
        printFib(a, b, n - 2);
    }
}