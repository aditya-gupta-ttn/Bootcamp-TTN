package Assignment1Multithreding2;

import java.util.concurrent.*;

public class Question1CallableVsRunnable {
    public static void main(String[] args) {
        // Creating a thread pool with two threads
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Implementing Runnable (does not return a result)
        Runnable runnableTask = () -> System.out.println("Runnable task executed.");
        executor.submit(runnableTask);

        // Implementing Callable (returns a result)
        Callable<String> callableTask = () -> "Callable task executed.";
        Future<String> futureResult = executor.submit(callableTask);

        try {
            // Retrieving the result of Callable
            System.out.println(futureResult.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        // Shutting down the executor
        executor.shutdown();
    }
}

