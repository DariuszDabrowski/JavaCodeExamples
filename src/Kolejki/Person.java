package Kolejki;

/**
 * Created by RENT on 2017-09-05.
 */
public class Person {
    private String name;
    private String koszyk;

    public Person(String name, String koszyk){
        this.name = name;
        this.koszyk = koszyk;
    }

    public String getName() {
        return name;
    }

    public String unpackShoping() {
        return "Wypakowuje na tasmociag: " + koszyk;
    }

    public String toString() {
        return String.format("Klient: %s\n Zawartość koszyka: %s", name, koszyk);
    }
}
