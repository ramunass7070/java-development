package fundamentals_coding.computer;

public enum Color {
    WHITE("Balta"),
    BLACK("Juoda"),
    RED("Raudona"),
    ORANGE("Oranzine"),
    YELLOW("Geltona"),
    GREEN("Zalia"),
    INDIGO("Zydra"),
    BLUE("Melyna"),
    VIOLET("Violetine");

    String name;

    Color() {
    }

    Color(String name) {
        this.name = name;
    }
}
