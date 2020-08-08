package advancedfeatures.lesson1.homework.encapsulation.pocket;

public class PocketMain {

    public static void main(String... args) {

        Pocket wallet = new Pocket(123);

        wallet.addMoney(500);
        wallet.addMoney(100);
        System.out.println(wallet.getMoney());
    }
}
