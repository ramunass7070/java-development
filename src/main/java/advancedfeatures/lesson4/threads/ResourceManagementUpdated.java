package advancedfeatures.lesson4.threads;

import java.util.concurrent.atomic.AtomicInteger;

public class ResourceManagementUpdated {
    static int counter = 0;
    static int counterSync = 0;

    static synchronized void increaseCounterSync() {
        counterSync++;
    }

    static AtomicInteger atomicInteger = new AtomicInteger(0);


    public static void main(String... args) {

//        void synchronization () { //sinchornizacinis blokas
//            synchronized (this) {
//            counter++;
//            }
//        }

        Thread counterIncrease = new Thread(() -> {
            for (int i = 0; i < 10000; i += 2) {
                counter++;
                increaseCounterSync();
                atomicInteger.addAndGet(1);
            }
            System.out.println("counterIncrease finished counter " + counter + " " + counterSync + " " + atomicInteger);
//            System.out.println("counterIncrease finished  counterSync " + counterSync);
//            System.out.println("counterIncrease finished atomicInteger " + atomicInteger);

        });

        Thread counterIncrease1 = new Thread(() -> {
            for (int i = 0; i < 10000; i += 2) {
                counter++;
                increaseCounterSync();
                atomicInteger.addAndGet(1);
            }
            System.out.println("counterIncrease1 finished counter: " + counter + " " + counterSync + " " + atomicInteger);
//            System.out.println("counterIncrease1 finished counterSync: " + counterSync);
//            System.out.println("counterIncrease1 finished atomicInteger: " + atomicInteger);
        });

//        Thread counterIncrease2 = new Thread(() -> {
//            for (int i = 0; i < 10000; i++) {
////              counter++;
//                increaseCounter();
//            }
//
//            System.out.println("thread counterIncrease2 finished " + counter);
//        });

        counterIncrease.start();
        counterIncrease1.start();
//        counterIncrease2.start();

    }
}
