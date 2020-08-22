package advancedfeatures.lesson4.streams.phone_streamx_sample;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Streamx {

    public static void main(String[] args) {

        List<Phone> list = new ArrayList<>();

//        Phone phone = new Phone("iPhone", 1500);

        list.add(new Phone("iPhone", 1500));
        list.add(new Phone("AndroidPhone", 500));
        list.add(new Phone("Xiaomi", 200));
        list.add(new Phone("Samsung", 900));
        list.add(new Phone("Sony", 800));

        System.out.println(list);
        System.out.println("=======pafiltruojam kuriu kaina >600 ==========");

//      pafiltruojam per stream visus, kuriu kaina didesne nei 600

        list.stream()
                .filter(phone -> phone.price > 600)
                .map(phone -> phone.name)               // maping stream'e
                .forEach(phoneName -> System.out.println(phoneName));

        System.out.println("=======stream nekeicia paties list==========");

//       stream nekeicia paties list
        for (Phone phone : list) {
            System.out.println(phone.name + " " + phone.price);
        }

        System.out.println("=======filtreuojam < 1000 ir surenkam duomenis==========");
//      filtruojam ir surenkam duomenis
        List<Phone> filtered = list.stream()
                .filter(phone -> phone.price < 1000)
                .collect(Collectors.toList());


        System.out.println("=======filtruotu spausdinimas==========");
//      filtruotu isspausdinimas
        filtered.forEach(phone -> System.out.println(phone.name + " " + phone.price));


        System.out.println("++++++++++++\n++++++++++++\n++++++++++++");
//
        System.out.println("-----maping-----");
//      lista pastreaminam, praleidziam per filtra ir sumapinam. ir rezultata surasom i nauja Map objekta "namePriceMap"
        Map<String, Integer> namePriceMap = list.stream()
                .filter(phone -> phone.price > 600)
                .collect(Collectors.toMap(phone -> phone.name, phone -> phone.price)); // maping

        System.out.println(namePriceMap);

        System.out.println("-----stream.count-----");
        // po pertraukos kzks idomaus
        long count = list.stream().filter(phone -> phone.price > 600)
                .count();

        System.out.println("phone number with price over 600: " + count);

//      stream reduce f-ja
        System.out.println("______reduce_______");

        int sumOfPrices = list.stream()
                .filter(phone -> phone.price > 750)
                .map(phone -> phone.price)
                .reduce(0, (sum, price) -> sum + price);

        System.out.println("sum of prices: " + sumOfPrices);


    }
}

