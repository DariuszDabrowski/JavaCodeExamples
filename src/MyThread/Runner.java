package MyThread;

/**
 * Created by RENT on 2017-09-04.
 */
public class Runner {
    public static void main(String[] args) {
        Thread[] threads = new Thread[10];
        Runnable[] runners = new Runnable[10];
        runners[0] = new MyRun("Darek");
        runners[0] = new MyRun("Paweł");
        runners[0] = new MyRun("Grzesiek");
        runners[0] = new MyRun("Janek");
        runners[0] = new MyRun("Mrysia");
        runners[0] = new MyRun("Wojtek");
        runners[0] = new MyRun("Sławek");
        runners[0] = new MyRun("Kuba");
        runners[0] = new MyRun("Maciek");
        runners[0] = new MyRun("Michał");

        for (int i = 0; i < 10; i++) {
            threads[i] = new Thread(runners[i]);
        }

        for (int i = 0; i < 10; i++) {
            threads[i].start();
        }


    }
}
