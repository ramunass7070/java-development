package advancedfeatures.lesson3.collection_samples;

import javax.swing.*;
import java.util.ArrayList; // ArrayList is implementation of Collections Class with List interface
import java.util.Collections;
import java.util.Iterator;
import java.util.List; // class List is interface type

public class Listx {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Vilnius");
        list.add("Kaunas");
        list.add("Prague");

        System.out.println("1" + list);

        list.add(2, "Barcelona");
        System.out.println("2" + list);

        String city = list.get(3);
        System.out.println("3" + "City: " + city);

        //remove by object
        list.remove(new String("Prague"));
        System.out.println("4" + list);

        //remove by index
        list.remove(2);
        System.out.println("5" + list);

        int index = list.indexOf("Kaunas");
        System.out.println("6" + "Kaunas index: " + index);

        list.add(2, "Kaunas");
        list.add(1, "Trakai");
        System.out.println("7" + list);

        int lastIndex = list.lastIndexOf("Kaunas");
        System.out.println("8" + "Kaunas index: " + index);

        boolean contains = list.contains("Trakai");
        System.out.println("Trakai is in the list: " + contains);

        System.out.println("--------for iteravimas su list objektu-------");
        for (String cityName : list) {
            System.out.println(cityName);
        }


        System.out.println("==== iteravimas su Iterator dalyku ====");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String cityName = iterator.next();
            System.out.println(cityName);
            if (cityName.equals("Vilnius")) {
                iterator.remove();
            }
        }
        System.out.println(list);

        list.add("Vilnius");
        list.add("Barcelona");
        list.add("Berlin");
        list.add("Ryga");
        list.add("Tallin");

        System.out.println("---------shuffle------------");

        System.out.println("befroe: " + list);
        Collections.shuffle(list); // randomising sequence
        System.out.println("after shuffle: " + list);
        Collections.sort(list); //sorting
        System.out.println("after sort: " + list);

        System.out.println("---------list.sort------------");
        Collections.shuffle(list);
        list.sort(null);
        System.out.println("list sorted:");
        System.out.println(list);
//        Collections.sort(list, Collections.reverseOrder());
        list.sort(Collections.reverseOrder());
        System.out.println("list reverse sorted:");
        System.out.println(list);


        System.out.println("++++++list.sub()++++++++");

        List<String> sub = list.subList(0,2); // istruakia sub list

        System.out.println("sub list: ");
        System.out.println(sub);
        System.out.println("full list: ");
        System.out.println(list);

        System.out.println("++++++list.clear()++++++++");
        list.clear();
        System.out.println(list);

    }
}
