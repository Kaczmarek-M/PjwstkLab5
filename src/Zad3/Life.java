// Marta Rosinska s18874
// Michal Kaczmarek s18464

package Zad3;

public class Life extends Insurance {

    public Life() {
        super("Life insurance");
    }

    @Override
    double setCost() {
        return getMonthlyPrice() + 36;
    }

    @Override
    String display() {
        return getTypeOfInsurance() + "\nmonthly cost: " + setCost() + " USD";
    }

}
