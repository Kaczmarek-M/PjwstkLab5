package Zad1;

public class Main {
    public static void main(String[] args) {
        Movable m1 = new MovableRectangle(1, 4, 4, 6, 2, 2);
        System.out.println(m1);
        m1.moveUp();
        m1.moveRight();
        System.out.println(m1);
    }
}
