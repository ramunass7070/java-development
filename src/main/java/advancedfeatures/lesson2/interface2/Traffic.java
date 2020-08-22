package advancedfeatures.lesson2.interface2;

import java.util.ArrayList;

public class Traffic {

    ArrayList<Transport> transports;

    Traffic() {
        transports = new ArrayList<>();

    }

    public void addTransport(Transport transport) {
        transports.add(transport);
    }

    public void slowDownTraffic() {
        for (Transport transport : transports) {
            transport.decelerate();
        }
    }

    public void speedUpTraffic() {
        for (Transport transport : transports) {
            transport.accelerate();
        }
    }

    @Override
    public String toString() {
        return "Traffic{" +
                "transports=" + transports +
                '}';
    }
}
