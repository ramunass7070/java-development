
package fundamentals_coding.pollution;

/*
 *   Sukurti Country klasę, kuri turėst ypatybes (name, co2Emission, PollutionFactor -
 *  ANIMAL_HUSBANDRY, TRANSPORTATION, FACTORIES)
 *   Sukurti Continent klasę, kuri turės ypatybes (name, masyvą Country objektų);
 *       Inicializuoti 3 continent objektus, kiekvienam po 3 country objektus;
 *       Surasti labiausiai užterštą valstybę;
 *       Surasti mažiausiai užterštą žemyną;
 *       Apskaičiuoti visų žemynų bendrą užterštumą
 *   Pastaba: Jei didžiausias užterštumo faktorius šalyje yra:
 *      'ANIMAL_HUSBANDRY', tuomet šalies co2 kiekį dauginkite iš 1.2,
 *      'TRANSPORTATION', tuomet šalies co2 kiekį dauginkite iš 0.9,
 *      'FACTORIES', tuomet šalies co2 kiekį dauginkite iš 1.4
 * */

public class PollutionMain {
    public static void main(String... args) {

        Continent[] continents = buildContinents();
        findMostPollutedCountry(continents);
        findMostPollutedContinent(continents);
        printLeastPollutedContinent(continents);
        printGlobalEmmision(continents);
    }


    private static Continent[] buildContinents() {
        return new Continent[]{
                new Continent("NorthAmerica", new Country[]{
                        new Country("USA", 2450, PollutionFactor.TRANSPORTATION),
                        new Country("Canada", 3221, PollutionFactor.ANIMAL_HUSBANDRY),
                        new Country("Mexico", 6855, PollutionFactor.FACTORIES),
                }),
                new Continent("Europe", new Country[]{
                        new Country("UK", 7455, PollutionFactor.ANIMAL_HUSBANDRY),
                        new Country("Germany", 4162, PollutionFactor.FACTORIES),
                        new Country("Poland", 6288, PollutionFactor.TRANSPORTATION)
                }),

                new Continent("Asia", new Country[]{
                        new Country("China", 55, PollutionFactor.FACTORIES),
                        new Country("India", 27, PollutionFactor.ANIMAL_HUSBANDRY),
                        new Country("Kazachstan", 38, PollutionFactor.TRANSPORTATION)
                })
        };
    }

    private static void findMostPollutedCountry(Continent[] continents) {
        Country mostPolluted = continents[0].getCountries()[0];
        for (Continent continent : continents) {
            for (Country country : continent.getCountries()) {
                if (mostPolluted.calculatePollution() < country.calculatePollution()) {
                    mostPolluted = country;
                }
            }
        }
        System.out.printf("Most polluted country %s with CO2 emmision %s", mostPolluted.getName(), mostPolluted.getCo2Emission());
    }

    private static void findMostPollutedContinent(Continent[] continents) {
        Continent mostPollutedContinent = continents[0];
        for (Continent cont : continents) {
            if (cont.findContinentPollution() > mostPollutedContinent.findContinentPollution()) {
                mostPollutedContinent = cont;
            }
        }
        System.out.printf("\nMost polluted continent %s with total pollution of %.2f",
                mostPollutedContinent.getName(), mostPollutedContinent.findContinentPollution());
    }

    private static void printLeastPollutedContinent(Continent[] continents) {
        Continent leastPollutedContinent = continents[0];
        for (Continent c : continents) {
            if (leastPollutedContinent.findContinentPollution() > c.findContinentPollution()) {
                leastPollutedContinent = c;
            }
        }
        System.out.printf("%nLeast polluted continent %s with CO2 emmision %.2f", leastPollutedContinent.getName(), leastPollutedContinent.findContinentPollution());
    }

    private static double calculateContinentPollution(Continent continent) {
        double pollution = 0;
        for (Country country : continent.getCountries()) {
            pollution += country.calculatePollution();
        }
        return pollution;
    }

    private static void printGlobalEmmision(Continent[] continents) {
        double total = 0;
        for (Continent cont : continents) {
            total += calculateContinentPollution(cont);
        }
        System.out.printf("\nTotal emmision is %.2f", total);
    }

//    private


}


