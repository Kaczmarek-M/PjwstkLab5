// Marta Rosinska s18874
// Michal Kaczmarek s18464

package Zad7;

public class Pizza implements Comparable<Pizza>{
    private double calories;
    private String name;
    private double price;

    public Pizza(double calories, String name, double price) {
        this.calories = calories;
        this.name = name;
        this.price = price;
    }

    public double getCalories() {
        return calories;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "calories=" + calories +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Pizza o) {
        if (price == o.price)
            return 0;
        else if (price > o.price)
            return 1;
        else
            return -1;
    }
}
