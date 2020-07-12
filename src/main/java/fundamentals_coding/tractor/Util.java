package fundamentals_coding.tractor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Util {

    public static Tractor findOldest(Tractor[] tractors) {
        Tractor oldest = tractors[0];
        for (Tractor tractor : tractors) {
            if (tractor.getMake().isBefore(oldest.getMake())) {
//                System.out.println("oldest found");
                oldest = tractor;
            }
        }
        return oldest;
    }

    public static Tractor findNewest(Tractor[] tractors) {
        Tractor newest = tractors[0];
        for (Tractor tractor : tractors) {
            if (tractor.getMake().isAfter(newest.getMake())) {
//                System.out.println("newest found");
                newest = tractor;
            }
        }
        return newest;
    }

    public static Tractor findMostExpensive(Tractor[] tractors) {
        Tractor mostExpensive = tractors[0];
        for (Tractor tractor : tractors) {
            if (tractor.getPrice() > mostExpensive.getPrice()) {
                mostExpensive = tractor;
            }

        }
        return mostExpensive;
    }

    public static Tractor[] findTankSizeAtLeast(int minTankSize, Tractor[] tractors) {
        ArrayList<Tractor> list = new ArrayList<>();
        for (Tractor tractor : tractors) {
            if (tractor.getTankSize() >= minTankSize) {
                list.add(tractor);
            }
        }
        return list.toArray(new Tractor[list.size()]);
    }


    public static Tractor[] findModelStartsWith(String firstLetter, Tractor[] tractors) {
        ArrayList<Tractor> list = new ArrayList<>();
        for (Tractor tractor : tractors) {
            if (tractor.getMaker().manufacturer.toLowerCase().startsWith(firstLetter.toLowerCase())) {
                list.add(tractor);
            }
        }
        return list.toArray(new Tractor[list.size()]);
    }


}

