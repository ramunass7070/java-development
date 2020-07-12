package fundamentals_coding.wind;

public class UtilWind {

    public static double toKnots(Wind wind) {
        return wind.getSpeedKmH() * 0.54;
    }

    public static double toMeterPerSec(Wind wind) {
        return wind.getSpeedKmH() * 1000.00 / 3600.00;
    }


    public static double toBeufortScale(Wind wind) {
        return Math.pow((toMeterPerSec(wind) / 0.836), (2.00 / 3.00));
    }

    public static BeufortScale representBeufortScale(Wind wind) {
        double number = toBeufortScale(wind);
        int index = 0;
        if (number < +0.75) {
            index = 0;
        } else if (number > 11) {
            index = 12;
        } else {
            index = (int) number + 1;
        }

        BeufortScale scale[] = {
                (BeufortScale.SCALE_0), (BeufortScale.SCALE_1), (BeufortScale.SCALE_2),
                (BeufortScale.SCALE_3), (BeufortScale.SCALE_4), (BeufortScale.SCALE_5),
                (BeufortScale.SCALE_6), (BeufortScale.SCALE_7), (BeufortScale.SCALE_8),
                (BeufortScale.SCALE_9), (BeufortScale.SCALE_10), (BeufortScale.SCALE_11),
                (BeufortScale.SCALE_12)
        };
        return scale[index];
    }

    public static double convertBeufortToMetersPerSecond(int beufortNumber) {
        return (0.836 * Math.pow(beufortNumber, 1.5));
    }

    public static void printBeufortScale() {
        for (int i = 0; i < 13; i++) {
            System.out.printf("Beufort number is %d, corresponding speed %.2f m/s%n",
                    i, convertBeufortToMetersPerSecond(i));
        }
    }
}
