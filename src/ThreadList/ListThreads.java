package ThreadList;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by RENT on 2017-09-04.
 */
public class ListThreads implements Runnable{
    private ArrayList<Integer> _stageOne = new ArrayList<>();
    private ArrayList<Integer> _stageTwo = new ArrayList<>();
    private Object stageOneLocker = new Object();
    private Object stageTwoLocker = new Object();
    private int counter;

    private Random rand = new Random();

    public void stageOne() throws InterruptedException {
        synchronized (stageOneLocker) {
            Thread.sleep(1);
            _stageOne.add(rand.nextInt());
            counter++;
        }
    }
    public void stageTwo() throws InterruptedException {
        synchronized(stageTwoLocker) {
            Thread.sleep(1);
            _stageTwo.add(rand.nextInt());
            counter++;
        }
    }

    public void process() throws InterruptedException {
        while (counter < 1000){
            stageOne();
            stageTwo();
        }
    }

    @Override
    public void run() {
        try{
            process();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
