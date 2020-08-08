package advancedfeatures.lesson1.homework.encapsulation.dog;

public class DogMain {

    public static void main(String... args) {

        Dog dog = new Dog("Bricius", 2, "male", "kiemsargis", 8);

        System.out.println(dog);

        System.out.println("=================");

        System.out.println(dog.getName());
        System.out.println(dog.getAge());
        System.out.println(dog.getWeight());

        System.out.println("=================");

        dog.setWeight(49);
        dog.setAge(19);

        System.out.println(dog.getWeight());
        System.out.println(dog.getAge());

        System.out.println("=================");
//        System.out.println("=================");
    }
}
