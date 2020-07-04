package fundamentals_coding.tractor;

import java.time.LocalDate;
//import java.time.Year;


public class Tractor {
    private TractorMaker maker; //enmum
    private String model;
    private int tankSize;
    private LocalDate make; //pagaminimo data;
    private double price;

    public Tractor() {

    }

    public Tractor(TractorMaker maker, String model, int tankSize, LocalDate make, double price) {
        this();
        this.maker = maker;
        this.model = model;
        this.tankSize = tankSize;
        this.make = make;
        this.price = price;
    }


    public TractorMaker getMaker() {
        return maker;
    }

    public String getModel() {
        return model;
    }

    public int getTankSize() {
        return tankSize;
    }

    public LocalDate getMake() {
        return make;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Tractor{" +
                "maker=" + maker.manufacturer +
                " Origin: " + maker.country +
                ", model='" + model + '\'' +
                ", tankSize=" + tankSize +
                ", make=" + make +
                ", price=" + price +
                '}';
    }
}

