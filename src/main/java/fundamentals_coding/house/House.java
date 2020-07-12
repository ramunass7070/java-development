package fundamentals_coding.house;

public class House {

    private double houseArea;
    private String district;
    private int builtYear;
    private String condition;   //fitted, partially finished, not finished


    public House(double houseArea, String district, int builtYear, String condition) {
        this.houseArea = houseArea;
        this.district = district;
        this.builtYear = builtYear;
        this.condition = condition;
    }

    public String getCondition() {
        return condition;
    }

    public double getHouseArea() {
        return houseArea;
    }

    public int getBuiltYear() {
        return builtYear;
    }

    public void printHouse() {
        System.out.printf("House{ houseArea: %.2f; district: %s; buildYear: %d; condition: %s}%n", houseArea, district, builtYear, condition  );
    }

    @Override
    public String toString() {
        return "House{" +
                "houseArea=" + houseArea +
                ", district='" + district + '\'' +
                ", builtYear=" + builtYear +
                ", condition='" + condition + '\'' +
                '}';
    }
}

