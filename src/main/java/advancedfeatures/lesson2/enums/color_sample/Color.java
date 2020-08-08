package advancedfeatures.lesson2.enums.color_sample;

public enum Color {

    RED("#00FF0054"),
    GREEN("#00FZ1122"),
    BLUE("#01FF6666"),
    YELLOW("#12FA0121");

    private String code;

    Color(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
