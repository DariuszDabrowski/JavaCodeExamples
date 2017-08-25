package TaliaKart;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static TaliaKart.Karta.*;

public class Talia {

    public ArrayList<Karta> prototypeDeck(){
        List<Karta> list = new ArrayList<Karta>();
        for (Figures f : Figures.values())
            for (Colors c : Colors.values())
                list.add(new Karta(f, c));
        return new ArrayList<>(list);
    }

    public ArrayList<Karta> nextTalia(){
        return new ArrayList<>(prototypeDeck());
    }

    public ArrayList<Karta> tasuj(ArrayList<Karta> talia){
        Collections.shuffle(talia);
        return talia;
    }
}
