// Marta Rosinska s18874
// Michal Kaczmarek s18464

package Zad7;

public class PizzaClass extends Pizza implements IPizzaChoice{
    private String size;
    private String olive;
    private String parmaHam;
    private String pepperoni;

    public PizzaClass(double calories, String name, double price, String size, String olive, String parmaHam, String pepperoni) {
        super(calories, name, price);
        this.size = size;
        this.olive = olive;
        this.parmaHam = parmaHam;
        this.pepperoni = pepperoni;


    }

    @Override
    public void littleOlive() {
        olive = "mala ilosc";
    }

    @Override
    public void mediumOlive() {
        olive = "srednia ilosc";
    }

    @Override
    public void largeOlive() {
        olive = "duza ilosc";
    }

    @Override
    public void littleParmham() {
        parmaHam = "mala ilosc";
    }

    @Override
    public void mediumParmHam() {
        parmaHam = "srednia ilosc";
    }

    @Override
    public void largeParmHam() {
        parmaHam = "duza ilosc";
    }

    @Override
    public void littlePepperoni() {
        pepperoni = "mala ilosc";
    }

    @Override
    public void mediumPepproni() {
        pepperoni = "srednia ilosc";
    }

    @Override
    public void largePepperoni() {
        pepperoni = "duza ilosc";
    }

    @Override
    public void smallSize() {
        size = "mala";
    }

    @Override
    public void mediunSize() {
        size = "srednia";
    }

    @Override
    public void largeSize() {
        size = "duza";
    }
    @Override
    public String toString() {
        return "PizzaWoogy{" +
                "name= " + getName() +
                ", price= " + getPrice() +
                ", calories= " + getCalories() +
                ", size='" + size + '\'' +
                ", olive='" + olive + '\'' +
                ", parmaHam='" + parmaHam + '\'' +
                ", pepperoni='" + pepperoni + '\'' +
                '}';
    }
}
