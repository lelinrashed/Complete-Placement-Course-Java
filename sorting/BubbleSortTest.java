package sorting;

public class BubbleSortTest {
    public static void main(String[] args) {
        // Initialize our first unsorted array
        int arr[] = { 3, 1, 9, 4, 5, 7 };

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    System.out.println(arr[j]);
                }
            }
        }

    }
}