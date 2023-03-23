package recursion;

public class Reverse {
    public static void printRev(String str, int index) {
        if (index == 0) {
            System.out.println(str.charAt(index));
            return;
        }

        System.out.print(str.charAt(index));
        printRev(str, index - 1);
    }

    public static void main(String[] args) {
        String name = "Rashed";
        printRev(name, name.length() - 1);
    }
}
