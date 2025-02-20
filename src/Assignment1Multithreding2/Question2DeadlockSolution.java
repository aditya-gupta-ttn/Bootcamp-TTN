package Assignment1Multithreding2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Resource {
    String name;
    Lock lock = new ReentrantLock();

    Resource(String name) {
        this.name = name;
    }
}

public class Question2DeadlockSolution {
    public static void main(String[] args) {
        Resource res1 = new Resource("Resource 1");
        Resource res2 = new Resource("Resource 2");

        Runnable task1 = () -> acquireLocks(res1, res2);
        Runnable task2 = () -> acquireLocks(res2, res1);

        new Thread(task1, "Thread-1").start();
        new Thread(task2, "Thread-2").start();
    }

    private static void acquireLocks(Resource resA, Resource resB) {
        while (true) {
            boolean resALocked = false;
            boolean resBLocked = false;

            try {
                resALocked = resA.lock.tryLock();
                resBLocked = resB.lock.tryLock();

                if (resALocked && resBLocked) {
                    System.out.println(Thread.currentThread().getName() + " locked " + resA.name);
                    System.out.println(Thread.currentThread().getName() + " locked " + resB.name);
                    break;
                }
            } finally {
                if (resALocked && !resBLocked) resA.lock.unlock();
                if (resBLocked && !resALocked) resB.lock.unlock();
            }

            // Adding a short delay before retrying to avoid busy-waiting
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        // Unlocking both resources after work is done
        resA.lock.unlock();
        resB.lock.unlock();
    }
}

