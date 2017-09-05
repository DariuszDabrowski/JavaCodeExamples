package Zbiory;

import java.util.HashSet;
import java.util.TreeSet;

/**
 * Created by RENT on 2017-09-05.
 */
public class Main {
    public static void main(String[] args) {
        TreeSet<String> nazwiska = new TreeSet();
        nazwiska.add("Kowalski");
        nazwiska.add("Nowak");
        nazwiska.add("Wiśniewski");
        nazwiska.add("Norek");
        nazwiska.add("Antczak");
        for (String n: nazwiska){
            System.out.println(n);
        }
        HashSet<Integer> interg = new HashSet<>();
        interg.add(1);
        interg.add(2);
        interg.add(4);
        interg.add(5);
        interg.add(6);
        interg.add(7);
        HashSet<Integer> integers = new HashSet<>();
        integers.add(2);
        integers.add(8);
        integers.add(3);
        integers.add(9);
        integers.add(1);
        integers.retainAll(interg);



        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(1);
        ts.add(6);
        ts.add(7);
        Integer zzz = ts.ceiling(5);
        System.out.println(zzz);
    }
}
