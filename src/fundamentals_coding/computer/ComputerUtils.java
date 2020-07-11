package fundamentals_coding.computer;

import java.util.ArrayList;

public class ComputerUtils {

    public static Computer findCheapest(Computer[] all) {
        Computer cheapest = all[0];
        for (Computer computer : all) {
            if (computer.getPrice() < cheapest.getPrice()) {
                cheapest = computer;
            }
        }
        return cheapest;
    }

    public static Computer findOldest(Computer[] all) {
        Computer oldest = all[0];
        for (Computer computer : all) {
            if (computer.getMadeYear().isBefore((oldest.getMadeYear()))) {
                oldest = computer;
            }
        }
        return oldest;
    }

    public static Computer[] findByEndOfName(String lastLetter, Computer[] all) {
        ArrayList<Computer> matchedObjects = new ArrayList<>();
        for (Computer computer : all) {
            if (computer.getMaker().toString().endsWith(lastLetter)) {
//            if (computer.getMaker().name().endsWith(lastLetter)) {   // su enum naudoti ne "toString()", o "name()" - duos enumeratoriaus reiksme (spicialiai tam sukurtas metodas)
                matchedObjects.add(computer);
            }
        }
        return matchedObjects.toArray(new Computer[matchedObjects.size()]);
    }

    public static int countByColor(Computer[] all, Color color) {
        int count = 0;
        for (Computer pc : all) {
            if (pc.getColor().equals(color)) { // cia negalima naudoti == palyginimui, nes lyginame du objektus, o ne primitive reiksmes
                count++;
            }
        }
        return count;
    }


}
