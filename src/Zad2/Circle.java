// Marta Rosinska s18874
// Michal Kaczmarek s18464

package Zad2;

public class Circle implements GeometricObject {
    protected double radius = 1.0;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return radius * Math.PI * 2;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }
}
