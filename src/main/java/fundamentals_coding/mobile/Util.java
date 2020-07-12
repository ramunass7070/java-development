package fundamentals_coding.mobile;

public class Util {


    public static Mobile findMostPricey(Mobile[] mobiles) {
        Mobile mostPricey = mobiles[0];
//        double maxPrice = mobiles[0].getPrice();
        for (Mobile mobile : mobiles) {
            if (mobile.getPrice() > mostPricey.getPrice()) {
                mostPricey = mobile;
            }
        }
        return mostPricey;
    }



}
