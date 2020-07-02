package fundamentals_coding.wind;

public class Wind {

    private double speedKmH;
    private BeufortScale beufortScale;


    public Wind(double speedKmH) {
        this.speedKmH = speedKmH;
    }

    public void setBeufortScale(BeufortScale beufortScale) {
        this.beufortScale = beufortScale;
    }

    public double getSpeedKmH() {
        return speedKmH;
    }

    @Override
    public String toString() {
        return "Wind{" +
                "speedKmH=" + speedKmH +
                '}';
    }
}
