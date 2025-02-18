package Assignment8.Question2;

class SharedResource {
    private int count = 0;

    // Synchronized method to prevent race conditions
    public synchronized void increment() {
        count++;
        System.out.println(Thread.currentThread().getName() + " - Count: " + count);
    }

    // Synchronized block to allow finer-grained locking
    public void decrement() {
        synchronized (this) {
            count--;
            System.out.println(Thread.currentThread().getName() + " - Count: " + count);
        }
    }

    public int getCount() {
        return count;
    }
}

public class SynchronizationExample {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        // Creating multiple threads
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                resource.increment();  // Calls synchronized method
            }
        }, "Thread-1");

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                resource.decrement();  // Calls synchronized block
            }
        }, "Thread-2");

        t1.start();
        t2.start();

        // Wait for threads to complete
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final Count: " + resource.getCount());
    }
}

