package Assignment8.Question1;

class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("Thread using Thread Class");

    }
}
public class ThreadUsingClass{
    public static void main(String[] args) {
        MyThread thread=new MyThread();
        thread.start();
    }
}
