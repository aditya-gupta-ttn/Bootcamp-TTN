package Assignment8.Question1;

//Create and Run a Thread using Runnable Interface and
// Thread class and show usage of sleep and join methods in the created threads.
class ThreadRunnable implements Runnable{

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread using Runnable Interface");
    }
}

public class ThreadUsingRunnable {
    public static void main(String[] args) {
        ThreadRunnable th1=new ThreadRunnable();
        Thread thread=new Thread(th1);

        thread.start();

        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        // using thread.join() the main thread will be terminated only after

        System.out.println("Program Executed");


    }
}

