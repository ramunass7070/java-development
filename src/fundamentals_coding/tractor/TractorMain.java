package fundamentals_coding.tractor;

import utils.RandomGenerator;

import java.time.LocalDate;

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
                Util.findOldest(tractorList).toString(),
                Util.findNewest(tractorList).toString(),
                Util.findMostExpensive(tractorList).toString()
        );

        System.out.printf("%n%nTractors with FUEL TANK SIZE bigger than %d:", tankSize);
        for (Tractor tracktuor : Util.findTankSizeAtLeast(tankSize, tractorList)) {
            System.out.printf("%n%s", tracktuor.toString());
        }

        System.out.printf("%n%nTractors whose maker starts with >>\"%s\"<< :",  startsWith);
        for (Tractor tracktor : Util.findModelStartsWith(startsWith, tractorList)) {
            System.out.printf("%n%s", tracktor.toString());
        }

    }

    public static Tractor[] initiateTractors(int size) {
        Tractor[] tractors = new Tractor[size];
        double price;   // kaina
        int tankSize;   // bako dydis
        LocalDate make; //pagaminimo data
        String model;   //modelio pavadinimas
        TractorMaker[] makers = {TractorMaker.CASE, TractorMaker.CAT, TractorMaker.JCB, TractorMaker.MTZ, TractorMaker.JOHNDEER};
        TractorMaker maker; // gamintojo pavadinimas;
        //parameters:
            int tankSizeMin = 30;
            int tankSizeMax = 3000;
            int priceMin = 20000;
            int priceMax = 2000000;
        for (int i = 0; i < size; i++) {
            model = RandomGenerator.generateRandomName(4, 3);
            tankSize = RandomGenerator.generateRandomInteger(tankSizeMin, tankSizeMax);
            price = RandomGenerator.generateRandomDouble(priceMin, priceMax);
            make = LocalDate.now().minusDays((long) RandomGenerator.generateRandomInteger(0, 32000));
            maker = makers[RandomGenerator.generateRandomInteger(0, 4)];
            tractors[i] = new Tractor(maker, model, tankSize, make, price);
        }
        return tractors;
    }
}
