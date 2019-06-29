package MyThread;

/**
 * Created by RENT on 2017-09-04.
 */
public class MyRun implements Runnable {
    private String name;

    public MyRun(String name){
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(name + " WITAJ!");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Goodby " + name);
    }
}
