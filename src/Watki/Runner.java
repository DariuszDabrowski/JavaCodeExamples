package Watki;

/**
 * Created by RENT on 2017-09-04.
 */
public class Runner {

    public static void main(String[] args) {
       // Runnable[] runners = new Runnable[10];
       // Thread[] threads = new Thread[10];
        MyRun[] runners = new MyRun[10];
        for (int i = 0; i < 10; i++) {
            runners[i] = new MyRun(i);
        }
//        for (int i = 0; i < 10; i++) {
//            threads[i] = new Thread(runners[i]);
//        }
        for (int i = 0; i < 10; i++) {
            runners[i].run();
        }
    }
}
