package advancedfeatures.lesson2.interface2;

public class Examples {

    public static void main(String[] args) {

        Traffic traffic = new Traffic();

        Plane plane = new Plane();

        Transport plane2 = new Plane();

        traffic.addTransport(plane);
        traffic.addTransport(plane2);

        traffic.speedUpTraffic();
        traffic.slowDownTraffic();

        traffic.addTransport(new JetPack(120));

        traffic.speedUpTraffic();
        traffic.speedUpTraffic();
        traffic.slowDownTraffic();

        System.out.println(traffic.toString());
    }
}
