package fundamentals_coding.house.using_enums;

public enum HouseDistrict {

    ZAPYSKIS("Zapyskio seniunija"),
    JUSTINISKES("Justiniskes, Vilnius"),
    FABIJONISKES("Fabijoniskes, Vilnius"),
    SESKINE("Seskine, Vilnius"),
    ANTAVILIAI("Antaviliai, Vilniaus raj."),
    SAULETEKIS("Sauletekis, Vilnius"),
    CENTRAS("Centras, Vilniaus m. seniunija"),
    SAULETEKIAI("Sauletekiai, Kauno raj."),
    RIESE("Riese, Vilniaus raj."),
    GIEDRAICIAI("Giedraiciai, Vilniaus raj.");

    public String name;

    HouseDistrict(String name) {
        this.name = name;
    }

}
