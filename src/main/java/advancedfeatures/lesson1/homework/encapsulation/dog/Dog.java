package advancedfeatures.lesson1.homework.encapsulation.dog;

public class Dog {
    private String name;
    private int age;
    private String gender;
    private String race;
    private int weight;

    private Dog() {
    }

    public Dog(String name, int age, String gender, String race, int weight) {
        this();
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.race = race;
        this.weight = weight;
    }

    public Dog(String gender, String race) {
        this();
        this.gender = gender;
        this.race = race;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public void setAge(int age) {
        this.age = verifyAge(age);
    }

    public void setWeight(int weight) {
        this.weight = verifyWeight(weight);
    }

    private int verifyWeight(int input) {
        if (input > 0 && input < 50) {
            return input;
        } else {
            System.err.printf("Weight %d is out of valid limits (0 < x < 50)\n", input);
            return this.weight;
        }
    }

    private int verifyAge(int input) {
        if (input > 0 && input < 20) {
            return input;
        } else {
            System.err.printf("Age %d is out of valid limits (0 < x < 20)\n", input);
            return this.age;
        }
    }

    @Override
    public String toString() {
        return "Dog {name: " + this.name
                + "; age: " + this.age
                + "; gender: " + this.gender
                + "; race: " + this.race
                + "; weight: " + this.weight
                + "; }";
    }


}

