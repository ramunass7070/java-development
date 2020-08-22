package advancedfeatures.lesson3.collection_samples;

import java.util.HashSet;   // collections impelmentacija su set interface
import java.util.Iterator;
import java.util.Set; // interface

public class Setx {
    public static void main(String[] args) {

        Set<String> names = new HashSet<>();

        names.add("Theodor");
        names.add("Theodor"); // duplikatai neprisideda
        names.add("Tom");
        names.add("Suzy");
        names.add("Peter");

        System.out.println(names);

        names.remove("Tom");

        System.out.println(names);

        boolean contains = names.contains("Suzy");
        System.out.println("Suzy in set: " + contains);

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("=======su normaliu foreach loop============");

        for (String name : names) {
            System.out.println(name);
        }

    }
}
