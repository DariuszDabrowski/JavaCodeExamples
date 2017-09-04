package SimpleSynchronization;

/**
 * Created by RENT on 2017-09-04.
 */
public class Main {
    public int counter;
    public synchronized void increment(){
        counter++;
    }

    public static void main(String[] args) throws InterruptedException {
        Main my = new Main();
        my.doWork();
    }
    public void doWork() throws InterruptedException {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    increment();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    increment();
                }
            }
        });

        t1.run();
        t2.run();

        t1.join();
        t2.join();

        System.out.println(counter);
    }
}
