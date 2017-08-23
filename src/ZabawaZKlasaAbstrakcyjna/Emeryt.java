package ZabawaZKlasaAbstrakcyjna;

/**
 * Created by RENT on 2017-08-23.
 */
public abstract class Emeryt {
    public static final int ILOSC_OCZU = 2;
    public abstract void krzyczNaDzieci(); //metoda abstrakcyjna –wdrażamy w kldziedz//zwykła metoda z implementacją

    public void biegnijDoSklepu(int odleglosc, int predkosc) {
        double czas = (double) odleglosc / predkosc;
        System.out.println("Biegne po kiełbase bede za " + czas);
    }
    public static void glupiaMetoda(){}
}
