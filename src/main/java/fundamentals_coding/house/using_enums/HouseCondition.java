package fundamentals_coding.house.using_enums;

public enum HouseCondition {

    FITTED("fitted house"),
    PARTIALLY_FINISHED("partially finished house"),
    NOT_FINISHED("not finished house");

    public String name;

    HouseCondition(String name) {
        this.name = name;
    }
}
