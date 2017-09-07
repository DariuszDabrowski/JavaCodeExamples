package Powtorka0709.Zad1;

import java.util.Arrays;
import java.util.List;

/**
 * Created by RENT on 2017-09-07.
 */
public class Main {
    public static void main(String[] args) {
        String str = "Ala ma kota";
        char letter = 'a';
        char[] letters = str.toLowerCase().toCharArray();
        int counter = 0;
        for (int i = 0; i < letters.length; i++){
            if (letter == letters[i])
                counter++;
        }
        System.out.println(counter);
    }
}
