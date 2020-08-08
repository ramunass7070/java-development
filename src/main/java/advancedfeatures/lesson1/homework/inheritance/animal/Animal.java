package advancedfeatures.lesson1.homework.inheritance.animal;

public class Animal {

    private String family;
    private int age;


    public Animal(String family, int age) {
        this.family = family;
        this.age = age;
    }

    public void yieldVoid(){
        System.out.println("animals generate general noise");
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    @Override
    public String toString() {
        return "Animal{" +
                "family='" + family + '\'' +
                ", age=" + age +
                '}';
    }
}
