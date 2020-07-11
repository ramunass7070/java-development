package fundamentals_coding.pollution;

public class Country {
    private String name;
    private double co2Emission;
    private PollutionFactor pollutionFactor;

    public Country(String name, double co2Emission, PollutionFactor pollutionFactor) {

        this.name = name;
        this.co2Emission = co2Emission;
        this.pollutionFactor = pollutionFactor;

    }

    public double calculatePollution() {
        switch (pollutionFactor) {
            case ANIMAL_HUSBANDRY:
                return co2Emission * 1.2;
            case TRANSPORTATION:
                return co2Emission * 0.9;
            case FACTORIES:
                return co2Emission * 1.4;
            default:
                return 0;
        }
    }

    public String getName() {
        return name;
    }

    public double getCo2Emission() {
        return co2Emission;
    }

    public PollutionFactor getPollutionFactor() {
        return pollutionFactor;
    }

    public void setCo2Emission(double co2Emission) {
        this.co2Emission = co2Emission;
    }

    public void setPollutionFactor(PollutionFactor pollutionFactor) {
        this.pollutionFactor = pollutionFactor;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", co2Emission=" + co2Emission +
                ", pollutionFactor=" + pollutionFactor +
                '}';
    }
}

