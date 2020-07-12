package fundamentals_coding.tractor;

import utils.RandomGenerator;

import java.time.LocalDate;

import static fundamentals_coding.tractor.TractorMaker.*;
import static fundamentals_coding.tractor.Util.*;
import static utils.RandomGenerator.*;

public class TractorMain {
    public static void main(String[] args) {

        Tractor[] tractorList = initiateTractors(500);
        for (Tractor tractor : tractorList) {
            System.out.println(tractor);
        }

        int tankSize = 2900;
        String startsWith = "case";

        System.out.printf("%nOldest tractor: %s%n" +
                        "%nNewest tractor: %s%n" +
                        "%nMost expensive: %s",
                findOldest(tractorList).toString(),
                findNewest(tractorList).toString(),
                findMostExpensive(tractorList).toString()
        );

        System.out.printf("%n%nTractors with FUEL TANK SIZE bigger than %d:", tankSize);
        for (Tractor tracktuor : findTankSizeAtLeast(tankSize, tractorList)) {
            System.out.printf("%n%s", tracktuor.toString());
        }

        System.out.printf("%n%nTractors whose maker starts with >>\"%s\"<< :",  startsWith);
        for (Tractor tracktor : findModelStartsWith(startsWith, tractorList)) {
            System.out.printf("%n%s", tracktor.toString());
        }
    }

    public static Tractor[] initiateTractors(int size) {
        Tractor[] tractors = new Tractor[size];
        double price;   // kaina
        int tankSize;   // bako dydis
        LocalDate make; //pagaminimo data
        String model;   //modelio pavadinimas
        TractorMaker[] makers = {CASE, CAT, JCB, MTZ, JOHNDEER};
        TractorMaker maker; // gamintojo pavadinimas;
        //parameters:
            int tankSizeMin = 30;
            int tankSizeMax = 3000;
            int priceMin = 20000;
            int priceMax = 2000000;
        for (int i = 0; i < size; i++) {
            model = generateRandomName(4, 3);
            tankSize = generateRandomInteger(tankSizeMin, tankSizeMax);
            price = generateRandomDouble(priceMin, priceMax);
            make = LocalDate.now().minusDays((long) generateRandomInteger(0, 32000));
            maker = makers[generateRandomInteger(0, 4)];
            tractors[i] = new Tractor(maker, model, tankSize, make, price);
        }
        return tractors;
    }
}
