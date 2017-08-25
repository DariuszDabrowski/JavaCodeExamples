package OrzelReszka;


import java.util.Random;
import java.util.Scanner;

public class Main {

    public enum GameMoves {ORZEL, RESZKA, Q}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int wins = 0;
        int lose = 0;
        int numberOfGames = 0;
        GameMoves playerMove = GameMoves.ORZEL;
        GameMoves cpuMove = GameMoves.RESZKA;

        System.out.println("ORZEL vs RESZKA");

        while (!playerMove.equals(GameMoves.Q)) {
            switch (rand.nextInt(2)){
                case 0:
                    cpuMove = GameMoves.ORZEL;
                    break;
                case 1:
                    cpuMove = GameMoves.RESZKA;
                    break;
            }
            System.out.println("Rzucilem moneta!");
            System.out.println("Co wybierasz? ");

            String choise = sc.nextLine();

            switch (choise.toLowerCase()) {
                case "o":
                    if (cpuMove.equals(GameMoves.ORZEL)){
                        System.out.println("WYPADL ORZEL WYGRALES");
                        wins++;
                    } else if (cpuMove.equals(GameMoves.RESZKA)){
                        System.out.println("WYPADLA RESZKA PRZEGRALES");
                        lose++;
                    }
                    break;
                case "r":
                    if (cpuMove.equals(GameMoves.RESZKA)){
                        System.out.println("WYPADLA RESZKA WYGRALES");
                        wins++;
                    } else if (cpuMove.equals(GameMoves.ORZEL)){
                        System.out.println("WYPADL ORZEL PRZEGRALES");
                        lose++;
                    }
                    break;
                case "q":
                    playerMove = GameMoves.Q;
                    break;
                    default:
                        continue;
            }
            numberOfGames++;
        }
        System.out.printf("Zagrales %d razy z czego wygrales %d " +
                " a przegrales %d ",numberOfGames, wins, lose);

    }
}



