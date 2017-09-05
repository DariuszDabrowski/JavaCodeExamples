package OperatorAdam;

/**
 * Created by Darek on 2017-09-05.
 */
public class Main {
    public static void main(String[] args) {
        OperatorAdam operatorAdam = new OperatorAdam();
        Ambulance ambulance = new Ambulance(operatorAdam);
        Police police = new Police(operatorAdam);
        FireBrigade fireBrigade = new FireBrigade(operatorAdam);

        operatorAdam.setStatus("Car accident");
        operatorAdam.setStatus("Faint");
        operatorAdam.setStatus("Broken bone");
    }
}
