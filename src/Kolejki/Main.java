package Kolejki;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Created by RENT on 2017-09-05.
 */
public class Main {
    public static void main(String[] args) {

        ArrayDeque<Person> kolejka = new ArrayDeque<>();
        kolejka.add(new Person("Jadzia", "chleb, masło"));
        kolejka.add(new Person("Gienia", "nalewka babuni, kiełbasa zwyczajna"));
        kolejka.add(new Person("Zosia", "bułka, ser, woda"));
        //zaczynamy obsługe
        while (!kolejka.isEmpty()){
            Person currentClient = kolejka.removeFirst();
            System.out.println(currentClient.getName());
            System.out.println(currentClient.unpackShoping());
        }
    }
}
