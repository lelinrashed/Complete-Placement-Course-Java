package oop;

// create our class
class Pen {
    String color;
    String type;

    // define constructor
    Pen(String color, String type) {
        this.color = color;
        this.type = type;
    }

    public void printColor() {
        System.out.println(this.color);
        System.out.println(this.type);
    }
}

public class ClassOOP {
    public static void main(String args[]) {
        Pen pen1 = new Pen("blue", "gel");
        pen1.printColor();
    }
}