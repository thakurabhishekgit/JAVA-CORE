package ThreadsImpl;

class Counter {
    private int count = 0;

    public synchronized void increment() { // synchronized prevents race
        count++;
    }

    public int getCount() {
        return count;
    }
}

public class SyncDemo {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Runnable task = () -> {
            for (int i = 0; i < 1000; i++)
                counter.increment();
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(counter.getCount()); // Always 2000
    }
}
