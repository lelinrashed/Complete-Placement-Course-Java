package recursion;

public class LetterOccarence {
    public static int first = -1;
    public static int last = -1;

    public static void findOccarence(String str, int index, char element) {
        if (index == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }

        char currElement = str.charAt(index);
        if (currElement == element) {
            if (first == -1) {
                first = index;
            } else {
                last = index;
            }
        }

        findOccarence(str, index + 1, element);
    }

    public static void main(String[] args) {
        findOccarence("afaaaf", 0, 'f');
    }
}