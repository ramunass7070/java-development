package fundamentals_coding.country_and_cities;

public class City {
    private String name;
    private double sizeInSquareKilometers;
    private long population;

    public City(String name, double sizeInSquareKilometers, long population) {
        this.name = name;
        this.sizeInSquareKilometers = sizeInSquareKilometers;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public double getSizeInSquareKilometers() {
        return sizeInSquareKilometers;
    }

    public long getPopulation() {
        return population;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", sizeInSquareKilometers=" + sizeInSquareKilometers +
                ", population=" + population +
                '}';
    }
}
