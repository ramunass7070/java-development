package fundamentals_coding.pollution;

import java.util.Arrays;

public class Continent {
    private String name;
    private Country[] countries;

    public Continent(String name, Country[] countries) {
        this.name = name;
        this.countries = countries;
    }

    public double findContinentPollution() {
        double pollution = 0;
        for (Country c : countries) {
            pollution = pollution + c.calculatePollution();
        }
        return pollution;
    }

    public String getName() {
        return name;
    }

    public Country[] getCountries() {
        return countries;
    }


    @Override
    public String toString() {
        return "Continent{" +
                "name='" + name + '\'' +
                ", countries=" + Arrays.toString(countries) +
                '}';
    }
}
