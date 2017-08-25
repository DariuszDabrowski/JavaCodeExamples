package TaliaKart;


public class Karta {
    private Karta figura;
    private Karta color;

    public Karta(Karta figura, Karta color){
        this.figura = figura;
        this.color = color;
    }
    public String toString(){
        return figura + " of " + color;
    }
}
