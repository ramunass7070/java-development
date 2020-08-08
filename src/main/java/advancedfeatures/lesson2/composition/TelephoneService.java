package advancedfeatures.lesson2.composition;

public class TelephoneService {

    public static void main(String[] args) {


        Phone phone = new Phone(
                new OS("Android", 4),
                new Battery(26),
                new Hardware(2)
        );


        phone.runDiagnostics();

        System.out.println("========================");

        Battery battery = phone.getBattery();
        battery.checkCharge();
        battery.decreaseCharge();
        battery.decreaseCharge();
        battery.decreaseCharge();
        battery.checkCharge();

        Hardware hardware = phone.getHardware();
        hardware.checkVersion();

        OS os = phone.getOs();
        os.checkVersion();
        os.checkName();

    }

}
