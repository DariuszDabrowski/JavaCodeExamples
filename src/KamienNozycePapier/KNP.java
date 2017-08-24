package KamienNozycePapier;

import java.util.Random;
import java.util.Scanner;

import static KamienNozycePapier.KNP.dzialanie.n;

public class KNP {
    public enum dzialanie{
        k, n, p, q;
    }

    public static void main(String[] args) {


        int wygrane = 0;
        int przegrane = 0;
        int remisy = 0;

        while (true){
            Random rand = new Random();
            String[] tab = {"k", "n", "p"};
            int liczba = rand.nextInt()%3;
            String wylosowano = tab[liczba];
            Scanner scaner = new Scanner(System.in);
            String wybrano = scaner.nextLine();
            switch (wybrano){
                case "k":
                    if(wylosowano.equals("n")){
                        System.out.println("Wygrana");
                        wygrane++;
                    } else if (wylosowano.equals("p")){
                        System.out.println("Przegrana");
                        przegrane++;
                    } else if (wylosowano.equals("k")) {
                        System.out.println("Remis");
                        remisy++;
                    }
                    break;
                case "n":
                    if(wylosowano.equals("p")){
                        System.out.println("Wygrana");
                        wygrane++;
                    } else if (wylosowano.equals("k")){
                        System.out.println("Przegrana");
                        przegrane++;
                    } else if (wylosowano.equals("n")) {
                        System.out.println("Remis");
                        remisy++;
                    }
                    break;
                case "p":
                    if(wylosowano.equals("k")){
                        System.out.println("Wygrana");
                        wygrane++;
                    } else if (wylosowano.equals("n")){
                        System.out.println("Przegrana");
                        przegrane++;
                    } else if (wylosowano.equals("p")) {
                        System.out.println("Remis");
                        remisy++;
                    }
                    break;
                case "q":
                    System.out.printf("wygrane - %d, przegrane - %d, remisy - d%",wygrane, przegrane,remisy);
                    break;
                default:
                    System.out.println("Nie znana akcja!");
            }
        }


    }



}
