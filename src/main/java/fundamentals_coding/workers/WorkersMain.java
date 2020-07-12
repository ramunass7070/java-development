package fundamentals_coding.workers;

public class WorkersMain {

    public static void main(String... args) {

        Worker[] workers = initWorkers();

        System.out.printf("Average age: %f" +
                        "%n Average Salary: %f" +
                        "%n Highest Salary: %f" +
                        "%n Highest Salary Worker: %s" +
                        "%n Youngest Worker: %s",
                Util.countAverageAge(workers),
                Util.countAverageSalary(workers),
                Util.findHighestSalary(workers),
                Util.findHighestSalaryWorker(workers),
                Util.findYoungest(workers));
    }

    public static Worker[] initWorkers() {
        Worker[] workers = {
                new Worker("Jonas", 1250, 25, WorkerGender.MALE),
                new Worker("Aloyzas", 950, 38, WorkerGender.MALE),
                new Worker("Janina", 1500, 22, WorkerGender.FEMALE),
                new Worker("Alvyda", 1350, 40, WorkerGender.FEMALE),
                new Worker("Stasele", 650, 24, WorkerGender.FEMALE),
                new Worker("Mykolas", 1650, 44, WorkerGender.MALE),
        };
        return workers;
    }


}

