package advancedfeatures.lesson2.enums.emoji_sample;

public class EmojiMain {
    public static void main(String[] args) {

        Emojis emojis = Emojis.SMILE;

        switch (emojis) {
            case CRY:
                System.out.println(";(");
                break;
            case LAUGH:
                System.out.println(":D");
                break;
            case SMILE:
                System.out.println(":)");
                break;
            case AMAZED:
                System.out.println(":O");
                break;
            default:
                System.out.println("no face");
                break;
        }

        System.out.println("======Emojis2========");

        Emojis2 emojis2 = Emojis2.AMAZED;

        System.out.println(emojis2.getFace());
        System.out.println(emojis2.name());
        System.out.println(emojis2.getDescription());
    }
}
