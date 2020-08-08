package advancedfeatures.lesson1.inheritance.registration_office;

public class Worker extends Human {

    private String name;

    private String socialSecurityNumber;

    public Worker(String name, String socialSecurityNumber) {
        super(2, 4); // jeigu nerasom super(arg1, arg2) child klaseje, tai jis pgl nutylejima pakvieciamas tuscias: super()
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;

    }

    public void work() {
        System.out.println("Worker works");
    }




    @Override
    public void move() {
        System.out.println("worker moves");
    }

}
