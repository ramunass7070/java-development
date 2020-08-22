package advancedfeatures.lesson3.exceptions.child_exception;

public class Child {
    private int age;

    public Child() {
        this.age = 0;

    }

    public void setAge(int age) throws IllegalAgeException{
        if (this.age > age) {
            throw new IllegalAgeException("child age don't backwards");
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
