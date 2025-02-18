package Assignment8;

class VolatileExample extends Thread {
    private volatile boolean running = true;

    public void run() {
        while (running) {
            System.out.println("Running...");
        }
    }

    public void stopRunning() {
        running = false; // Now immediately visible to all threads
    }
}

public class Question3Volatile {
    public static void main(String[] args) throws InterruptedException {
        VolatileExample thread = new VolatileExample();
        thread.start();

        Thread.sleep(1000);
        thread.stopRunning(); // May not be reflected immediately
    }
}