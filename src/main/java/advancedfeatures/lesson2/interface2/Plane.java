package advancedfeatures.lesson2.interface2;

public class Plane implements Transport {

    int speed;

    Plane() {
        speed = 0;
    }

    @Override
    public void accelerate() {
        speed = speed + 100;
    }

    @Override
    public void decelerate() {
        speed = speed - 100;
    }

    void takeOff() {
        System.out.println("flight started");
    }

    void land() {
        System.out.println("flight ended");
    }

    @Override
    public String toString() {
        return "Plane{" +
                "speed=" + speed +
                '}';
    }
}

