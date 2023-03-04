package recursion;

public class Factorial {
    // Factorial number rule is n * (n-1)
    public static int calculateFactorial(int n) {
        if (n == 0) {
            return 1;
        }

        int nm1 = calculateFactorial(n - 1);
        return n * nm1;
    }

    public static void main(String[] args) {
        int x = calculateFactorial(5);
        System.out.println(x);
    }
}