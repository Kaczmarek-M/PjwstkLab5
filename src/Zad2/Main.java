// Marta Rosinska s18874
// Michal Kaczmarek s18464

package Zad2;

public class Main {
    public static void main(String[] args) {
        GeometricObject c1 = new Circle(4);
        System.out.println("Area of circle: " + c1.getArea() + "\n" + "Perimeter of circle: " + c1.getPerimeter());
        Resizable c2 = new ResizableCircle(10);
        System.out.println(c2.resize(12));
    }
}
