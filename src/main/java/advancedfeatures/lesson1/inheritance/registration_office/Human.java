package advancedfeatures.lesson1.inheritance.registration_office;

public class Human {

    private int legs;

    public int hands;

    public Human() {
    }

    public Human(int hands, int legs) {
        this.legs = 2;
        this.hands = 2;
    }

    public void move() {
        System.out.println("human moves");
    }

}
