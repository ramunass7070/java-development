/*
 * Sukurti Vehicle klasę, kuri privalo turėti: vehycleType(AUTOMOBILE, MOTORCYCLE, TRACTOR, EXCAVATOR), model, weight, maxSpeed
 *   Atspausdinti transporto priemonės objektą, jei modelio pavadinimas prasideda raide 'A';
 *   Atspausdinti visų AUTOMOBILE TP objektų pagaminimo metus;
 *   Atspausdinti visų MOTORCYCLE TP objektų maksimalų greitį;
 *   Atspausdinti visų TRACTOR TP objektų kainą;
 *   Atspausdinti visų EXCAVATOR TP objektų svorį;
 *   Atspausdinti TP gamintoją, kurių pagaminimo metai vėlesni nei 2018 ir maksimalus greitis mažesnis už 150 myliu per valandą;
 *  */
package fundamentals_coding.vehicle;

import java.time.LocalDate;

public class Vehicle {
    private Type vehycleType;
    private String model;
    private int weight;
    private int maxSpeed;
    private double price;
    private LocalDate makeYear;

    public Vehicle(Type vehycleType, String model, int weight, int maxSpeed, double price, String makeYear) {
        this.vehycleType = vehycleType;
        this.model = model;
        this.weight = weight;
        this.maxSpeed = maxSpeed;   //speed in kmh
        this.price = price;
        this.makeYear = LocalDate.parse(makeYear);

    }

    public double getPrice() {
        return price;
    }

    public LocalDate getMakeYear() {
        return makeYear;
    }

    public Type getVehycleType() {
        return vehycleType;
    }

    public String getModel() {
        return model;
    }

    public int getWeight() {
        return weight;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehycleType=" + vehycleType +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                ", maxSpeed=" + maxSpeed +
                ", price=" + price +
                ", makeYear=" + makeYear +
                '}';
    }
}
