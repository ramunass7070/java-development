package advancedfeatures.lesson1.homework.inheritance.animal;

public class Dog extends Animal {

    private String name;
    private int age;
    private int weight;

    public Dog(String family, int age) {
        super(family, age);
    }

    public Dog(String family, int age, String name, int age1, int weight) {
        super(family, age);
        this.name = name;
        this.age = age1;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public void yieldVoid() {
        System.out.println("Dogs also wowws");
    }

    @Override
    public String toString() {
        return super.toString() + "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
