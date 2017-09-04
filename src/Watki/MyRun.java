package Watki;

/**
 * Created by RENT on 2017-09-04.
 */
public class MyRun {
    private int _id;

    public MyRun(int id){
        _id = id;
    }

    //@Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.printf("hello from Thread %d\n",_id);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
