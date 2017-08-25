package TaliaKart;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Talia talia = new Talia();
        ArrayList<Karta> deck = talia.nextTalia();
        System.out.println(deck);
        talia.tasuj(deck);
        System.out.println(deck);

    }
}
