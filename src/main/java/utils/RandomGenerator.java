package utils;

import java.util.Random;

public class RandomGenerator {


    public static int generateRandomInteger(int min, int max) {
        Random random = new Random();
        return (min + random.nextInt(1 + max - min));
    }

    public static double generateRandomDouble(int min, int max) {
        Random random = new Random();
        double output = min + (random.nextDouble() * (max - min));
        return (min + random.nextInt(1 + max - min));
    }

    public static String generateRandomName(int symbolsCount, int digitsCount) {
        StringBuilder nameBuilder = new StringBuilder();
        Random random = new Random();

        for (int j = 0; j < symbolsCount; j++) {
            nameBuilder.append((char) (65 + random.nextInt(24)));
        }

        for (int i = 0; i < digitsCount; i++) {
            nameBuilder.append(random.nextInt(9));
        }

        return nameBuilder.toString();
    }

}
