package KamienNozycePapier;


import java.util.Scanner;

public class Main {
    public enum GameMoves {PAPIER, KAMIEN, NOZYCE, Q}
    public enum GameStats {WYGRANA, REMIS, PRZEGRANA}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GameMoves playerMove = GameMoves.KAMIEN;
        GameMoves cpuMove = GameMoves.NOZYCE;
        while (true) {
            String decision = sc.nextLine();
            switch (decision.toLowerCase()){
                case "n":
                    playerMove = GameMoves.NOZYCE;
                    break;
                case "k":
                    playerMove = GameMoves.KAMIEN;
                    break;
                case "p":
                    playerMove = GameMoves.PAPIER;
                    break;
                case "q":
                    break;
                default:
            }



        }

    }
    public GameStats amIWin(GameMoves playerMove, GameMoves cpuMove){
        if (playerMove.equals(GameMoves.KAMIEN)&&
                cpuMove.equals(GameMoves.KAMIEN))
            return GameStats.REMIS;
        return GameStats.REMIS;
    }
}
