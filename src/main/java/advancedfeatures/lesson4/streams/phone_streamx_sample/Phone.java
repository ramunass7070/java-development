package advancedfeatures.lesson4.streams.phone_streamx_sample;

public class Phone {

    String name;
    int price;

    Phone (String name, int price) {
        this.name = name;
        this.price = price;
    }

    double giveDiscount() {
        return price * 0.88;
    }

}
