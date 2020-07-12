package fundamentals_coding.tractor;

public enum TractorMaker {

    NULL("undefined", "undefined"),
    MTZ("MTZ", "Belarus"),
    JCB("JCB", "United Kingdom"),
    CAT("Caterpillar", "USA"),
    JOHNDEER("John deer", "Germany"),
    CASE("Case", "USA");



    public String manufacturer;
    public String country;

    TractorMaker(String manufacturer, String country) {
        this.manufacturer = manufacturer;
        this.country = country;
    }



}
