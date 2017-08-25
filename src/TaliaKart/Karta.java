package TaliaKart;

public class Karta {
    public enum Figures{
        DEUCE, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE
    }

    public enum Colors {
        CLUBS, DIAMONDS, HEARTS, SPADES
    }

    private Figures figura;
    private Colors color;

    public Karta(Figures figura, Colors color){
        this.figura = figura;
        this.color = color;
    }

    public String toString(){
        return figura + " of " + color;
    }
}
