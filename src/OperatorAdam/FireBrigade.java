package OperatorAdam;

/**
 * Created by Darek on 2017-09-05.
 */
public class FireBrigade implements IService {
    private IOperator operator;

    public FireBrigade(IOperator operator) {
        this.operator = operator;
        operator.registerObserver(this);
    }
    @Override
    public void update() {
        driveToIncident();
    }

    public void driveToIncident() {
        System.out.println(FireBrigade.class.getSimpleName() + " received a notification and is driving to incident right now!");
        System.out.println("Incident: " + operator.getStatus());
    }
}
