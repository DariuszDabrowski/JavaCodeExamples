package AnalogDigitalAdapter;

import java.util.Random;

public class RadioFM implements IAnalogSignal{

    private double[] analogData;

    public RadioFM(double[] analogData){
        Random rand = new Random();
       analogData = rand.doubles(16, 0.0, 2.0).toArray();
    }

    @Override
    public double[] getAnalog() {
        return new double[0];
    }

    @Override
    public void setAnalog(double[] analogData) {

    }

    @Override
    public void printAnalog() {

    }
}
