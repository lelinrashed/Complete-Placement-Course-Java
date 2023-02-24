package sorting;

public class Selection {

    public static void printArray(int arg[]) {
        for (int i = 0; i < arg.length; i++) {
            System.out.print(arg[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 8, 9, 3, 1, 5 };

        // Selection sort
        // Complexity = O(n^2)
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        printArray(arr);
    }
}