package advancedfeatures.lesson3.exceptions.child_exception;

public class GrowChild {

    public static void main(String[] args) {
        Child child = new Child();

        int age = child.getAge();

        try {
            child.setAge(age - 1);
        } catch (IllegalAgeException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("child age: " + child.getAge());
    }
}
