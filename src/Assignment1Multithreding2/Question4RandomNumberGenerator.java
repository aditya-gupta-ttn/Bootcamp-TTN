package Assignment1Multithreding2;

import java.util.concurrent.*;
import java.util.Random;

public class Question4RandomNumberGenerator {
    public static void main(String[] args) {
        // Creating a single-threaded executor
        ExecutorService executor = Executors.newSingleThreadExecutor();

        // Submitting a Callable task to generate a random number
        Future<Integer> future = executor.submit(() -> new Random().nextInt(100));

        try {
            // Retrieving and printing the result
            System.out.println("Random Number: " + future.get());
        } catch (InterruptedException | ExecutionException e) {
            System.err.println("Error executing task: " + e.getMessage());
            Thread.currentThread().interrupt(); // Restore interrupted state
        } finally {
            executor.shutdown(); // Properly shutting down the executor
        }
    }
}
