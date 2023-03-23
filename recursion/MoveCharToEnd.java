package recursion;

public class MoveCharToEnd {
    public static int count = 0;
    public static String newArr = "";

    public static void createArr(String arr, int index, char element) {
        if (index == arr.length()) {
            for (int i = 0; i < count; i++) {
                newArr += element;
            }
            return;
        }

        char currElement = arr.charAt(index);
        if (currElement == element) {
            count++;
            createArr(arr, index + 1, element);
        } else {
            newArr += currElement;
            createArr(arr, index + 1, element);
        }
    }

    public static void main(String[] args) {
        createArr("aoefafoiejaiofj", 0, 'f');
        System.out.println(newArr);
    }
}
