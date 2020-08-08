package advancedfeatures.lesson1.abstract_classes;

public class PetrolTruck extends Truck {


    @Override
    public void burnFuel() {
        System.out.println("Burns petrol");
    }

    @Override
    public void drive() {
        System.out.println("4 wheel drive");
        burnFuel();
    }
}
