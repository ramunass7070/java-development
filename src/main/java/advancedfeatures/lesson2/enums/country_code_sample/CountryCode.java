package advancedfeatures.lesson2.enums.country_code_sample;

public enum CountryCode {

    LITHUANIA("+370"),
    ESTONIA("+372"),
    LATVIA("+371"),
    PORTUGAL("+351"),
    SPAIN("+34");

    private String code;

    CountryCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
