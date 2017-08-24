package KamienNozycePapier;

import java.util.Random;
import java.util.Scanner;

public class KNP {

    public enum GameActiones{KAMIEN, NOZYCE, PAPIER, Q;}

    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        Random rand = new Random();

        int wygrane = 0;
        int przegrane = 0;
        int remisy = 0;
        int ileGier = 0;

        GameActiones playerMove = GameActiones.KAMIEN;
        GameActiones cpuMove = GameActiones.NOZYCE;

        System.out.println("Gra Kamien / Nozyce / Papier");

        while (!playerMove.equals(GameActiones.Q)){
            System.out.print("Twoj ruch: ");
            int random = rand.nextInt(3);
            switch (random){
                case 0:
                    cpuMove = GameActiones.KAMIEN;
                    break;
                case 1:
                    cpuMove = GameActiones.NOZYCE;
                    break;
                case 2:
                    cpuMove = GameActiones.PAPIER;
                    break;
            }

            String decision = scaner.nextLine();

            switch (decision){
                case "k":
                    if(cpuMove.equals(GameActiones.NOZYCE)){
                        System.out.println("Komputer Wybrał NOŻYCE");
                        System.out.println("WYGRALES");
                        wygrane++;
                    } else if (cpuMove.equals(GameActiones.PAPIER)){
                        System.out.println("Komputer Wybrał PAPIER");
                        System.out.println("PRZEGRALES");
                        przegrane++;
                    } else if (cpuMove.equals(GameActiones.KAMIEN)) {
                        System.out.println("Komputer Wybrał KAMIEN");
                        System.out.println("REMIS");
                        remisy++;
                    }
                    break;
                case "n":
                    if(cpuMove.equals(GameActiones.PAPIER)){
                        System.out.println("Komputer Wybrał PAPIER");
                        System.out.println("WYGRALES");
                        wygrane++;
                    } else if (cpuMove.equals(GameActiones.KAMIEN)){
                        System.out.println("Komputer Wybrał KAMIEN");
                        System.out.println("PRZEGRALES");
                        przegrane++;
                    } else if (cpuMove.equals(GameActiones.NOZYCE)) {
                        System.out.println("Komputer Wybrał NOZYCE");
                        System.out.println("REMIS");
                        remisy++;
                    }
                    break;
                case "p":
                    if(cpuMove.equals(GameActiones.KAMIEN)){
                        System.out.println("Komputer Wybrał KAMIEN");
                        System.out.println("WYGRALES");
                        wygrane++;
                    } else if (cpuMove.equals(GameActiones.NOZYCE)){
                        System.out.println("Komputer Wybrał NOZYCE");
                        System.out.println("PRZEGRALES");
                        przegrane++;
                    } else if (cpuMove.equals(GameActiones.PAPIER)) {
                        System.out.println("Komputer Wybrał PAPIER");
                        System.out.println("REMIS");
                        remisy++;
                    }
                    break;
                case "q":
                    playerMove = GameActiones.Q;
                    System.out.printf("zagrales - %d razy\n " +
                            "wygrales - %d razy\n przegrales - %d razy\n" +
                            " zremisowales - %d razy",ileGier, wygrane, przegrane,remisy);
                    break;
                default:
                    continue;
            }
            ileGier++;
        }

    }
}
