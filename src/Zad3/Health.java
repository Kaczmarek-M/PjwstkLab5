// Marta Rosinska s18874
// Michal Kaczmarek s18464

package Zad3;

public class Health extends Insurance {

    public Health() {
        super("Health insurance");
    }

    @Override
    double setCost() {
        return getMonthlyPrice() + 196;
    }

    @Override
    String display() {
        return getTypeOfInsurance() + "\nmonthly cost: " + setCost() + " USD";
    }
}
