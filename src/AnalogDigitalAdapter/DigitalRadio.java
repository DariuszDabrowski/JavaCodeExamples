package AnalogDigitalAdapter;

public class DigitalRadio implements IDigitalSignal{
    private int[] digitalData;

    public DigitalRadio() {}

    public DigitalRadio(int[] digitalData){
        this.digitalData = digitalData;
    }

    @Override
    public int[] getDigit() {
        return digitalData;
    }

    @Override
    public void setDigit(int[] digitData) {
        this.digitalData = digitData;
    }

    @Override
    public void printDigit() {
        for (int digitSignal : digitalData){
            System.out.printf(" %d ", digitSignal);
        }
    }
}
