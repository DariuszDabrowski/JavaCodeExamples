package StarCafe;


public class Bezkofeinowa extends Napoj {
    public Bezkofeinowa() {
        super.opis = "Bezkofeinowa";
    }

    @Override
    public double koszt() {
        return 1.05;
    }
}
