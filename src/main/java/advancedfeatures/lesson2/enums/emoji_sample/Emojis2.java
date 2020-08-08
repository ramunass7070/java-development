package advancedfeatures.lesson2.enums.emoji_sample;

public enum Emojis2 {
    SMILE(":)"),
    LAUGH(":D"),
    CRY(";("),
    AMAZED(":O");

    private String face;
    private String description;

    Emojis2(String face) {
        this.face = face;
    }

    public String getFace() {
        return face;
    }

    public String getDescription() {
        return description;
    }
}
