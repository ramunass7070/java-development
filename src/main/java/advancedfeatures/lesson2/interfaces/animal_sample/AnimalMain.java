package advancedfeatures.lesson2.interfaces.animal_sample;

public class AnimalMain {

    public static void main(String[] args) {

        Animal animal = new Animal();

        animal.walk();
        animal.breath();
        System.out.println("=====Implementations========");

        Implementations.drink();
    }
}
