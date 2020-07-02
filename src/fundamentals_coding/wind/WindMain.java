package fundamentals_coding.wind;

import java.util.Scanner;

import static fundamentals_coding.wind.UtilWind.convertBeufortToMetersPerSecond;
import static fundamentals_coding.wind.UtilWind.printBeufortScale;

public class WindMain {

    public static void main(String... args) {

        Wind wind = initiateWind();

        System.out.printf("%.2f km/h wind speed is equal to%n" +
                        "%.2f knots%n" +
                        "%.2f m/s%n" +
                        "%.2f Beufort force%n" +
                        "%s represents \"%s\"%n%n" +
                        "wave height is usually %s%n%n" +
                        "Sea conditions: %n%s%n%n" +
                        "Land conditions: %n%s%n",
                wind.getSpeedKmH(),
                UtilWind.toKnots(wind),
                UtilWind.toMeterPerSec(wind),
                UtilWind.toBeufortScale(wind),
                UtilWind.representBeufortScale(wind),
                UtilWind.representBeufortScale(wind).getName(),
                UtilWind.representBeufortScale(wind).getMaxWaveHeight(),
                UtilWind.representBeufortScale(wind).getSeaConditions(),
                UtilWind.representBeufortScale(wind).getLandConditions()
        );

//        printBeufortScale();
    }


    public static Wind initiateWind() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert wind speed in kmh:");
        double speed = scanner.nextDouble();
        return new Wind(speed);

    }
}
