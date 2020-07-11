/*
 * Sukurti Vehicle klasę, kuri privalo turėti: vehycleType(AUTOMOBILE, MOTORCYCLE, TRACTOR, EXCAVATOR)
 *  model,
 *  weight,
 *  maxSpeed,
 *  price,
 *  makeYear
 *   Atspausdinti transporto priemonės objektą, jei modelio pavadinimas prasideda raide 'A';
 *   Atspausdinti visų AUTOMOBILE TP objektų pagaminimo metus;
 *   Atspausdinti visų MOTORCYCLE TP objektų maksimalų greitį;
 *   Atspausdinti visų TRACTOR TP objektų kainą;
 *   Atspausdinti visų EXCAVATOR TP objektų svorį;
 *   Atspausdinti TP gamintoją, kurių pagaminimo metai vėlesni nei 2018 ir maksimalus greitis mažesnis už 150 myliu per valandą;
 *  */

package fundamentals_coding.vehicle;

import java.time.LocalDate;

import static fundamentals_coding.vehicle.Type.*;

public class VehicleMain {
    public static void main(String... args) {

        final long expectedYear = 2018;

        Vehicle[] vehicleArr = buildVehicle();

        printVehicleElementsByType(vehicleArr);
        printVehicleElements(vehicleArr, 150, expectedYear);

    }


    public static Vehicle[] buildVehicle() {
        Vehicle[] vehicleArr = {
                new Vehicle(AUTOMOBILE, "Polo", 1200, 65, 12_000, "1998-01-01"),
                new Vehicle(AUTOMOBILE, "Audi TT", 1600, 165, 35_000, "2015-01-01"),
                new Vehicle(MOTORCYCLE, "SUZUKI", 250, 265, 9_000, "2018-01-01"),
                new Vehicle(MOTORCYCLE, "Aprilia", 150, 138, 4_000, "2012-01-01"),
                new Vehicle(MOTORCYCLE, "Kawasaki", 120, 102, 8_000, "2015-01-01"),
                new Vehicle(TRACTOR, "Lamborgini", 5200, 37, 1_135_000, "2019-01-01"),
                new Vehicle(TRACTOR, "CASE", 3800, 27, 582_500, "2016-01-01"),
                new Vehicle(TRACTOR, "Belarus", 2200, 65, 122_000, "1995-01-01"),
                new Vehicle(EXCAVATOR, "CAT", 2500, 15, 8_000, "1985-01-01"),
                new Vehicle(EXCAVATOR, "SMT", 8800, 22, 12_000, "1999-01-01"),
                new Vehicle(AUTOMOBILE, "Toyota corolla", 1200, 134, 22_000, "2019-01-01")
        };
        return vehicleArr;
    }

    public static void printAutomobileIfNameStartsWith(String start, Vehicle[] vehicles) {
        for (Vehicle v : vehicles) {
            if (v.getModel().startsWith(start))
                System.out.println(v);
        }
    }

    public static void printMakeYear(Type type, Vehicle[] vehicles) {
        for (Vehicle v : vehicles) {
            if (v.getVehycleType().equals(type)) {
                System.out.println(v.getMakeYear());
            }
        }
    }

    public static void printMaxSpeed(Type type, Vehicle[] vehicles) {
        for (Vehicle v : vehicles) {
            if (v.getVehycleType().equals(type)) {
                System.out.println(v.getMaxSpeed());
            }

        }
    }

    public static void printVehicleElementsByType(Vehicle[] vehicles) {
        for (Vehicle v : vehicles) {
            switch (v.getVehycleType()) {
                case AUTOMOBILE:
                    System.out.printf("%s: %s \n", v.getVehycleType(), v.getMakeYear());
                    break;
                case TRACTOR:
                    System.out.printf("%s: %s \n", v.getVehycleType(), v.getPrice());
                    break;
                case EXCAVATOR:
                    System.out.printf("%s: %s \n", v.getVehycleType(), v.getWeight());
                    break;
                case MOTORCYCLE:
                    System.out.printf("%s: %s \n", v.getVehycleType(), v.getMaxSpeed());
                    break;
            }
        }
    }

    public static void printVehicleElements(Vehicle[] vehicles, int speedLowerThanMph, long expectedYear) {
        System.out.printf("%nSlower than %d, later than %d:\n", speedLowerThanMph, expectedYear);
        double speedLowerThanKmh = (double) speedLowerThanMph / 1.6;
        for (Vehicle v : vehicles) {
            if (v.getMaxSpeed() < speedLowerThanMph && v.getMakeYear().isAfter(LocalDate.ofEpochDay(expectedYear))) {
                System.out.printf("%s: speed %s make year %s\n", v.getModel(), v.getMaxSpeed(), v.getMakeYear());
            }
        }

    }

}
