package sorting;

public class Insertion {

    public static void printArray(int arg[]) {
        for (int i = 0; i < arg.length; i++) {
            System.out.print(arg[i] );
        }

        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 7, 1, 9 };

        // Insertion sort
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;

            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }

            // placement
            arr[j + 1] = current;
        }

        printArray(arr);
    }
}