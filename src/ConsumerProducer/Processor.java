package ConsumerProducer;

import java.util.Scanner;

/**
 * Created by RENT on 2017-09-04.
 */
public class Processor {
    public void produce() throws InterruptedException {
        synchronized (this) {
            System.out.println("Producer Thread is running!");
            wait();
            System.out.println("Producer resumed");
        }
    }
    public void consume() throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        Thread.sleep(2000);
        synchronized (this){
            System.out.println("Wait for enter");
            sc.nextLine();
            System.out.println("Enter Pressed");
            notify();
        }
    }
}
