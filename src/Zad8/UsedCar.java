// Marta Rosinska s18874
// Michal Kaczmarek s18464

package Zad8;

public class UsedCar extends UserCarException{
    private int vin;
    private String make;
    private int year;
    private int mileage;
    private int price;

    public UsedCar(int vin, String make, int year, int mileage, int price) {
        this.vin = vin;
        this.make = make;
        this.year = year;
        this.mileage = mileage;
        this.price = price;
    }

    public int getVin() {
        return vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "UsedCar{" +
                "vin=" + vin +
                ", make='" + make + '\'' +
                ", year=" + year +
                ", mileage=" + mileage +
                ", price=" + price +
                '}';
    }
}
