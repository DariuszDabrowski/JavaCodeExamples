package MyThread;

/**
 * Created by RENT on 2017-09-04.
 */
public class Runner {
    public static void main(String[] args) {
        Thread[] threads = new Thread[10];
        Runnable[] runners = new Runnable[10];
        runners[0] = new MyRun("Darek");
        runners[1] = new MyRun("Paweł");
        runners[2] = new MyRun("Grzesiek");
        runners[3] = new MyRun("Janek");
        runners[4] = new MyRun("Marysia");
        runners[5] = new MyRun("Wojtek");
        runners[6] = new MyRun("Sławek");
        runners[7] = new MyRun("Kuba");
        runners[8] = new MyRun("Maciek");
        runners[9] = new MyRun("Michał");

        for (int i = 0; i < 10; i++) {
            threads[i] = new Thread(runners[i]);
        }

        for (int i = 0; i < 10; i++) {
            threads[i].start();
        }
    }
}
