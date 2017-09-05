package AnalogDigitalAdapter;

public class Main {
    public static void main(String[] args) {
        RadioFM fm = new RadioFM();
        DigitalRadio dg = new DigitalRadio();
        AnalogToDigitalAdapter adapter = new AnalogToDigitalAdapter(fm);
        fm.printAnalog();
        System.out.println();
        System.out.println("--------------");
        adapter.printDigit();
    }

}
