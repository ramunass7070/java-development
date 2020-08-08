package advancedfeatures.lesson1.abstract_classes;

public class Road {

    public static void main(String[] args) {
        Car car = new Car();

        car.drive();


        Vehicle vehicle = new Car();

        vehicle.drive();

        Vehicle motorcycle = new Motorcycle();

        motorcycle.drive();

        System.out.println("==============================");

        Vehicle truck1 = new DieselTruck();

        truck1.drive();

        ((DieselTruck) truck1).burnFuel();

        truck1.drive();


        System.out.println("==============================");

        Truck truck2 = new DieselTruck();

        truck2.drive();
        truck2.burnFuel();

        System.out.println("==============================");

        Vehicle[] vehicles = new Vehicle[4];

        vehicles[0] = new Motorcycle();
        vehicles[1] = new Car();
        vehicles[2] = new DieselTruck();
        vehicles[3] = new PetrolTruck();

        System.out.println(vehicles.getClass());

        System.out.println(vehicles.getClass());

        System.out.println("==============================");

        for (Vehicle vh : vehicles) {
            vh.drive();
            System.out.println(vh.getClass());

        }


    }
}

