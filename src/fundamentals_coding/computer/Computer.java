package fundamentals_coding.computer;

import java.time.LocalDate;

public class Computer {
    private ComputerMaker maker;
    private double price;
    private Color color;
    private LocalDate madeYear;

    public Computer(ComputerMaker maker, Color color, LocalDate madeYear, double price) {
        this.maker = maker;
        this.color = color;
        this.madeYear = madeYear;
        this.price = price;
    }

    public ComputerMaker getMaker() {
        return maker;
    }

    public double getPrice() {
        return price;
    }

    public Color getColor() {
        return color;
    }

    public LocalDate getMadeYear() {
        return madeYear;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "maker=" + getMaker() +
                ", price=" + getPrice() +
                ", color=" + getColor() +
                ", madeYear=" + getMadeYear().getYear() +
                '}';
    }
}
