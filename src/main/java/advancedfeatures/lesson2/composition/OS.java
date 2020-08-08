package advancedfeatures.lesson2.composition;

public class OS {

    private String name;
    private int version;

    public OS(String name, int version) {
        this.name = name;
        this.version = version;
    }

    public void checkVersion() {
        if (version > 7) {
            System.out.println("OS is up to date");
        } else if (version > 3) {
            System.out.println("updates pending");
        } else {
            System.out.println("security risk");
        }
    }

    public void checkName() {
        if (name.equals("Android")) {
            System.out.println("Cool");
        } else if (name.equals("iOS")) {
            System.out.println("OK");
        } else {
            System.out.println("unkown os");
        }
    }


}
