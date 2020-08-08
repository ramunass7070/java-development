package advancedfeatures.lesson1.abstract_classes;

public class DieselTruck extends Truck {

    @Override
    public void drive() {
        System.out.println("Diesel TRUCK drives");
        burnFuel();
    }

    @Override
    public void burnFuel() {
        System.out.println("burns Diesel");
    }
}
