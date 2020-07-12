package fundamentals_coding.house.using_enums;

public class House {

    private double houseArea;
//    private String district;
    private HouseDistrict district;
    private int builtYear;
    private HouseCondition condition;   //fitted, partially finished, not finished


    public House(double houseArea, HouseDistrict district, int builtYear, HouseCondition condition) {
        this.houseArea = houseArea;
        this.district = district;
        this.builtYear = builtYear;
        this.condition = condition;
    }

    public HouseCondition getCondition() {
        return condition;
    }

    public double getHouseArea() {
        return houseArea;
    }

    public int getBuiltYear() {
        return builtYear;
    }

    public void printHouse() {
        System.out.printf("House{ houseArea: %.2f; district: %s; buildYear: %d; condition: %s}%n", houseArea, district.name, builtYear, condition.name  );
    }

    @Override
    public String toString() {
        return "House{" +
                "houseArea=" + houseArea +
                ", district='" + district.name + '\'' +
                ", builtYear=" + builtYear +
                ", condition='" + condition.name + '\'' +
                '}';
    }
}

