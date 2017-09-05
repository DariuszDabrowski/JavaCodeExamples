package AnalogDigitalAdapter;

import java.util.Random;

public class RadioFM implements IAnalogSignal{

    private double[] analogData;

    public RadioFM(){
        Random rand = new Random();
       analogData = rand.doubles(16, 0.0, 2.0).toArray();
    }

    @Override
    public double[] getAnalog() {
        return analogData;
    }

    @Override
    public void setAnalog(double[] analogData) {
        this.analogData = analogData;
    }

    @Override
    public void printAnalog() {
        for (double signal : analogData){
            System.out.printf(" %.2f ", signal);
        }
    }
}
