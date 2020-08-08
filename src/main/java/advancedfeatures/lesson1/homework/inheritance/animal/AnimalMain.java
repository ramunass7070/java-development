package advancedfeatures.lesson1.homework.inheritance.animal;

public class AnimalMain {

    public static void main(String[] args) {

        Animal[] animals = {
            new Animal("kates", 12),
            new Cat("sibirines", 5),
            new Cat("tigrines", 3),
            new Dog("dogas", 4),
            new Dog("spaniel", 6, "liuce", 3, 12)
        };

        for (Animal animal: animals) {
            System.out.println(animal.toString());
            animal.yieldVoid();
        }

    }

}
