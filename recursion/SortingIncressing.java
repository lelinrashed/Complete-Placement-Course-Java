package recursion;

public class SortingIncressing {
    public static boolean checkSortArr(int arr[], int index) {
        if (index == arr.length - 1) {
            return true;
        }

        if (arr[index] >= arr[index + 1]) {
            return false;
        }

        return checkSortArr(arr, index + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 3, 6, 6 };

        boolean result = checkSortArr(arr, 0);
        System.out.println(result);
    }
}
