package advancedfeatures.lesson2.composition;

public class Hardware {

    private int version;

    public Hardware(int version) {
        this.version = version;
    }

    public void checkVersion() {
        if (version > 10) {
            System.out.println("you have latest model");
        } else if (version > 3) {
            System.out.println("Device is old");
        } else {
            System.out.println("not maintained");
        }
    }

}
