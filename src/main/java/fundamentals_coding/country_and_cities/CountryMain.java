package fundamentals_coding.country_and_cities;

public class CountryMain {
    public static void main(String[] args) {

        Country[] countries = buildCountries();

        printBiggestCityOfEachCountry(countries);
        printBiggestCityOverall(countries);
        printSmallestByPopulation(countries);
        printGlobalPopulation(countries);
        printSmallestCountryByPopulation(countries);
    } // end of main method

    // other methods
    private static Country[] buildCountries() {
        Country[] countries = {
                new Country("Lietuva", new City[]{
                        new City("Kaunas", 250, 350_000),
                        new City("Vilnius", 350, 550_000),
                        new City("Balbieriskis", 15, 850)}),
                new Country("Germany", new City[]{
                        new City("Munich", 151, 1_248_511),
                        new City("Berlin", 220, 2_205_324),
                        new City("Leipzig", 224, 850_110)}),
                new Country("UK", new City[]{
                        new City("London", 160, 105_081),
                        new City("Willobank", 7, 8_511),
                        new City("Belfast", 45, 50_200)})
        };
        return countries;
    }

    private static void printBiggestCityOfEachCountry(Country[] countries) {
        for (Country country : countries) {
            City biggestCity = country.getCities()[0];
            for (City city : country.getCities()) {
                if (city.getSizeInSquareKilometers() > biggestCity.getSizeInSquareKilometers()) {
                    biggestCity = city;
                }
            }
            System.out.printf("\nBiggest city of \"%s\" is \"%s\"", country.getName(), biggestCity.getName());
        }
    }

    private static void printBiggestCityOverall(Country[] countries) {
        City biggestCity = countries[0].getCities()[0];
        for (Country country : countries) {
            for (City city : country.getCities()) {
                if (city.getSizeInSquareKilometers() > biggestCity.getSizeInSquareKilometers()) {
                    biggestCity = city;
                }
            }
        }
        System.out.printf("\nBiggest city overall is \"%s\"", biggestCity.getName());
    }

    private static void printSmallestByPopulation(Country[] countries) {
        City smallestCity = countries[0].getCities()[0];
        for (Country country : countries) {
            for (City city : country.getCities()) {
                if (city.getPopulation() < smallestCity.getPopulation()) {
                    smallestCity = city;
                }
            }
        }
        System.out.printf("\nSmallest city by population overall is %s", smallestCity.getName());

    }

    private static long countryPopulation(Country country) {
        long population = 0;
        for (City city : country.getCities()) {
            population += city.getPopulation();
        }
        return population;
    }

    private static void printGlobalPopulation(Country[] countries) {
        long total = 0;
        for (Country country : countries) {
            total += countryPopulation(country);
        }
        System.out.printf("\nTotal population is \"%d\"", total);
    }

    private static void printSmallestCountryByPopulation(Country[] countries) {
        Country smallestCountry = countries[0];
        for (Country country : countries) {
            if (countryPopulation(country) < countryPopulation(smallestCountry)) {
                smallestCountry = country;
            }
        }
        System.out.printf("\nSmallest by population is \"%s\"", smallestCountry.getName());
    }


} // end of class
