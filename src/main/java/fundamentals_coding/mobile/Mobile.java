package fundamentals_coding.mobile;

public class Mobile {
    private String model;
    private String manufacturer;
    private double price;

    public Mobile(String model, String manufacturer, double price) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + (int) price +
                '}';
    }

    public void printMobile() {
        System.out.printf("Mobile{ model:\t%s,\t manufacturer:\t%s,\t price:\t%.2f}%n", model, manufacturer, price);
    }

}

