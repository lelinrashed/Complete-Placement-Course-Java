package recursion;

public class Permutation {
    // Need to find out the permutation of a string
    // Step 1: Loop through the string
    // Step 2: Find the current character
    // Step 3: Find the fist string and last string from current character and merge
    // them
    // Step 4: write the termination case if str.lenght == 0 then print the
    // permutation string
    public static void printPermutation(String str, String permutation) {
        if (str.length() == 0) {
            System.out.println(permutation);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);

            String subStr = str.substring(0, i) + str.substring(i + 1);
            printPermutation(subStr, permutation + currChar);
        }

    }

    public static void main(String[] args) {
        String str = "hello";
        printPermutation(str, "");
    }
}