package AnalogDigitalAdapter;

public class AnalogToDigitalAdapter implements IDigitalSignal {

    private RadioFM radioFM;

    public AnalogToDigitalAdapter(RadioFM radioFM){
        this.radioFM = radioFM;
    }

    @Override
    public int[] getDigit() {
        return analogToDigit(radioFM.getAnalog());
    }

    @Override
    public void setDigit(int[] digitData) {

    }

    @Override
    public void printDigit() {
        for (int signal : getDigit()){
            System.out.printf(" %d ", signal);
        }

    }
    private int[] analogToDigit(double[] analogData){
        int[] binaryTab = new int[analogData.length];
        for (int i = 0; i < analogData.length; i++) {
            if (analogData[i] < 1){
                binaryTab[i] = 0;
            } else {
                binaryTab[i] = 1;
            }
        }
        int sum = 0;
        int iterator = 0;
        int[] digitData = new int[binaryTab.length/8];
        for (int i = 0; i < binaryTab.length; i+=8) {
            for (int j = 0; j < 8; j++) {
                if (binaryTab[i+j]==1)
                   sum += Math.pow(2,j);
            }
            digitData[iterator] = sum;
            iterator++;
            sum = 0;
        }
        return digitData;
    }
}
