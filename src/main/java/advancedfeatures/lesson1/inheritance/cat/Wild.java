package advancedfeatures.lesson1.inheritance.cat;

public class Wild {
    public static void main(String[] args) {
        Cat cat = new Cat(4);

        cat.purr();

        Tiger tiger = new Tiger(4);

        tiger.roar();

        tiger.purr();


    }
}
