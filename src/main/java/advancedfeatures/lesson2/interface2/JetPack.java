package advancedfeatures.lesson2.interface2;

public class JetPack implements Transport {

    double speed;

    JetPack() {
        speed = 0;
    }

    JetPack(int speed) {
        this.speed = speed;
    }

    @Override
    public void accelerate() {
        speed = (speed + 10) * 1.2;
    }

    @Override
    public void decelerate() {
        speed = speed * 0.8;
    }

    @Override
    public String toString() {
        return "JetPack{" +
                "speed=" + (float) speed +
                '}';
    }
}
