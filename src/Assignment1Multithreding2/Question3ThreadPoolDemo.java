package Assignment1Multithreding2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Question3ThreadPoolDemo {
    public static void main(String[] args) {
        List<Callable<String>> tasks = new ArrayList<>();

        // Creating a list of tasks
        for (int i = 1; i <= 5; i++) {
            int taskNum = i;
            tasks.add(() -> "Task " + taskNum + " completed by " + Thread.currentThread().getName());
        }

        // Executing tasks using different thread pools
        executeTasks(Executors.newSingleThreadExecutor(), tasks, "SingleThreadExecutor");
        executeTasks(Executors.newCachedThreadPool(), tasks, "CachedThreadPool");
        executeTasks(Executors.newFixedThreadPool(3), tasks, "FixedThreadPool");
    }

    private static void executeTasks(ExecutorService executor, List<Callable<String>> tasks, String executorType) {
        System.out.println("\n" + executorType + ":");
        try {
            List<Future<String>> results = executor.invokeAll(tasks);
            for (Future<String> result : results) {
                try {
                    System.out.println(result.get());
                } catch (ExecutionException e) {
                    System.err.println("Task execution failed: " + e.getMessage());
                }
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Execution was interrupted.");
        } finally {
            executor.shutdown();
        }
    }
}

