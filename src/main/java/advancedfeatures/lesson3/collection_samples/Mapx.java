package advancedfeatures.lesson3.collection_samples;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Mapx {
    public static void main(String[] args) {
        Map<String, Integer> grades = new HashMap<>();

        grades.put("Theodor", 8);
        grades.put("Sally", 4);
        grades.put("Sally", 10); // duplikatai uzsiraso ant virsaus, jei naudoji ta pati key - duplikatu nere
        grades.put("Tom", 4);
        grades.put("Suzy", 3);
        grades.put("Tim", 6);
        grades.put("Peter", 4);
        grades.put("John", 6);

        System.out.println(grades);


        boolean contains = grades.containsKey("Suzy");
        System.out.println("Suzy in HashMap: " + contains);

        if (contains) {
            System.out.println("suzy grade: " + grades.get("Suzy"));
        }
        System.out.println("+++++replace++++");

        grades.replace("Sally", 12);
        System.out.println(grades);

        System.out.println("+++++size++++");

        int size = grades.size();
        System.out.println(size);

        System.out.println("+++++isEmpty++++");

        boolean isEmpty = grades.isEmpty();
        System.out.println(isEmpty); // empty nera tas pats kas null. null reiskia, kad nera pacio collection. empty reiska, kad collection yra, bet tuscias - nera komponentu irasyta

        System.out.println("+++++reiksmiu istraukimas++++");

        Collection<Integer> values = grades.values();
        int allGradeSum = 0;
        for (int grade : values) {
            allGradeSum += grade;
        }

        System.out.println("+++++reiksmiu istraukimas key&value++++");

        int avg = allGradeSum / values.size();
        System.out.println("klases vidurkis : " + avg);

        for (Map.Entry<String, Integer> entry : grades.entrySet()) {        // sitas vienas svarbiausiu
            System.out.println("studenten " + entry.getKey());
            System.out.println("grade " + entry.getValue());
        }

        //        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//        System.out.println("=======su normaliu foreach loop============");
//
//        for (String name : grades) {
//            System.out.println(name);
//        }

    }
}
