package fundamentals_coding.workers;

public class Worker {
    private String name;
    private double salary;
    private int age;
    private WorkerGender gender;

    public Worker(String name, double salary, int age, WorkerGender gender) {
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
