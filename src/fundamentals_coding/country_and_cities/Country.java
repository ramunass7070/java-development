package fundamentals_coding.country_and_cities;

import java.util.Arrays;

public class Country {
    private String name;
    private City[] cities;

    public Country(String name, City[] cities) {
        this.name = name;
        this.cities = cities;
    }

    public String getName() {
        return name;
    }

    public City[] getCities() {
        return cities;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", cities=" + Arrays.toString(cities) +
                '}';
    }
}
