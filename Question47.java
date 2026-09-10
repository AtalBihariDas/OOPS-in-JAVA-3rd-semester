class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Runnable Thread: " + i);
            try { Thread.sleep(500); }
            catch (InterruptedException e) { System.out.println("Thread interrupted."); }
        }
    }
}
public class Question47 {
    public static void main(String[] args) {
        MyRunnable task = new MyRunnable();
        Thread t = new Thread(task);
        t.start();
    }
}
