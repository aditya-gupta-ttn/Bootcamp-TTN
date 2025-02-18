package Assignment8;

class Resource {
    private final String name;

    public Resource(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class DeadlockExample implements Runnable {
    private final Resource resource1;
    private final Resource resource2;

    public DeadlockExample(Resource resource1, Resource resource2) {
        this.resource1 = resource1;
        this.resource2 = resource2;
    }

    @Override
    public void run() {
        synchronized (resource1) {
            System.out.println(Thread.currentThread().getName() + " locked " + resource1.getName());

            try { Thread.sleep(100); } catch (InterruptedException e) {}

            synchronized (resource2) {
                System.out.println(Thread.currentThread().getName() + " locked " + resource2.getName());
            }
        }
    }
}

public class Question4DeadlockSimulation {
    public static void main(String[] args) {
        Resource resourceA = new Resource("Resource A");
        Resource resourceB = new Resource("Resource B");

        Thread thread1 = new Thread(new DeadlockExample(resourceA, resourceB), "Thread-1");
        Thread thread2 = new Thread(new DeadlockExample(resourceB, resourceA), "Thread-2");

        thread1.start();
        thread2.start();
    }
}

