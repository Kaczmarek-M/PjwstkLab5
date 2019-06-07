// Marta Rosinska s18874
// Michal Kaczmarek s18464

package Zad5;

public class Main {
    public static void main(String[] args) {
        Leaf leaf = new Leaf();
        Page page = new Page();
        Pancake pancake = new Pancake();
        GearBox gearBox = new GearBox();
        Tv tv = new Tv();
        leaf.turn();
        page.turn();
        pancake.turn();
        gearBox.turn();
        tv.turn();
    }
}
