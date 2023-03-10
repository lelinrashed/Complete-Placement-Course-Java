package arrays;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        try (// Scanner
        Scanner sc = new Scanner(System.in)) {
            int size = sc.nextInt();
            int numbers[] = new int[size];

            // Input
            for (int i = 0; i < size; i++) {
                numbers[i] = sc.nextInt();
            }

            // Output
            for (int i = 0; i < size; i++) {
                System.out.println(numbers[i]);
            }
        }

    }
}