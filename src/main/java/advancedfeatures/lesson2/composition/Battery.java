package advancedfeatures.lesson2.composition;

public class Battery {

    private int charge;

    public Battery(int charge) {
        this.charge = charge;
    }

    public void checkCharge() {
        if (charge > 95) {
            System.out.println("fully charged");
        } else if (charge > 25) {
            System.out.println("battery good");
        } else if (charge > 1) {
            System.out.println("battery low");
        } else {
            System.out.println("battery down");
        }
    }

    public void increaseCharge() {
        charge++;
    }

    public void decreaseCharge() {
        charge--;
    }

}
