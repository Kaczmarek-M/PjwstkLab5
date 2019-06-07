// Marta Rosinska s18874
// Michal Kaczmarek s18464

package Zad3;

public abstract class Insurance {
    private String typeOfInsurance;
    private double monthlyPrice;


    public Insurance(String typeOfInsurance){
        this.typeOfInsurance = typeOfInsurance;
    }

    public String getTypeOfInsurance() {
        return typeOfInsurance;
    }
    public double getMonthlyPrice() {
        return monthlyPrice;
    }

    @Override
    public String toString() {
        return "Insurance{" +
                "typeOfInsurance='" + typeOfInsurance + '\'' +
                ", monthlyPrice=" + monthlyPrice +
                '}';
    }

    abstract double setCost();
    abstract String display();
}
