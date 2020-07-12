package fundamentals_coding.workers;

public class Util {

    public static double countAverageAge(Worker[] workers) {
        int i = 1;
        int age = 0;
        for (Worker worker : workers) {
            age += worker.getAge();
            i++;
        }
        return (double) age / i;
    }

    public static double countAverageSalary(Worker[] workers) {
        int i = 1;
        double salaryTotal = 0;
        for (Worker worker : workers) {
            salaryTotal += worker.getSalary();
            i++;
        }
        return salaryTotal / i;
    }


    public static double findHighestSalary(Worker[] workers) {
        double maxSalary = workers[0].getSalary();
        for (Worker worker : workers) {
            if (worker.getSalary() > maxSalary) {
                maxSalary = worker.getSalary();
            }
        }
        return maxSalary;
    }

    public static Worker findHighestSalaryWorker(Worker[] workers) {
        Worker maxSalaryWorker = workers[0];
        for (Worker worker : workers) {
            if (worker.getSalary() > maxSalaryWorker.getSalary()) {
                maxSalaryWorker = worker;
            }
        }
        return maxSalaryWorker;
    }


    public static Worker findYoungest(Worker[] workers) {
        Worker youngest = workers[0];
        for (Worker worker : workers) {
            if (worker.getAge() < youngest.getAge()) {
                youngest = worker;
            }
        }
        return youngest;
    }


}
