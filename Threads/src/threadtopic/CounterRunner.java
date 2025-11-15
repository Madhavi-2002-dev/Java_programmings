package threadtopic;

class Counter {
    private int count = 0;

    // synchronized ensures only one thread can run this at a time
    public  void increment() {
        count++;
    }

    public  int getCount() {
        return count;
    }
}
public class CounterRunner {
	public static void main(String[] args) {
        Counter counter = new Counter();

        // Create multiple threads that increment the counter
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        // Start all threads
        t1.start();
        t2.start();
        t3.start();

        // Wait for all threads to finish
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print final counter value
        System.out.println("Final Counter Value: " + counter.getCount());
    }
}



