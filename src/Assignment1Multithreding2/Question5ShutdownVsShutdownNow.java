package Assignment1Multithreding2;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " started.");
            Thread.sleep(2000); // Simulating a long-running task
            System.out.println(Thread.currentThread().getName() + " completed.");
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " was interrupted.");
        }
    }
}

public class Question5ShutdownVsShutdownNow {
    public static void main(String[] args) throws InterruptedException {
        // Using shutdown()
        ExecutorService executor1 = Executors.newFixedThreadPool(2);
        System.out.println("Using shutdown():");
        for (int i = 0; i < 3; i++) {
            executor1.submit(new Task());
        }

        executor1.shutdown(); // Initiates an orderly shutdown (waits for running tasks to complete)
        Thread.sleep(3000);   // Allow time to observe the behavior

        // Using shutdownNow()
        ExecutorService executor2 = Executors.newFixedThreadPool(2);
        System.out.println("\nUsing shutdownNow():");
        for (int i = 0; i < 3; i++) {
            executor2.submit(new Task());
        }

        List<Runnable> unfinishedTasks = executor2.shutdownNow(); // Attempts to stop immediately
        System.out.println("Unfinished tasks: " + unfinishedTasks.size());
    }
}

