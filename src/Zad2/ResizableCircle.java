// Marta Rosinska s18874
// Michal Kaczmarek s18464

package Zad2;

public class ResizableCircle extends Circle implements Resizable {

    public ResizableCircle(double radius) {
        super(radius);
    }

    public double resize(int percent) {
        double radiusTemp;
        double sum;
        radiusTemp = radius / 100;
        sum = radiusTemp * percent;
        return radius - sum;
    }
}
