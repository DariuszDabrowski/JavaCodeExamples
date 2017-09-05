package OperatorAdam;

/**
 * Created by Darek on 2017-09-05.
 */
public class Police implements IService {
    private IOperator operator;

    public Police(IOperator operator) {
        this.operator = operator;
        operator.registerObserver(this);
    }
    @Override
    public void update() {
        driveToIncident();
    }

    public void driveToIncident() {
        System.out.println(Police.class.getSimpleName() + " received a notification and is driving to incident right now!");
        System.out.println("Incident: " + operator.getStatus());
    }
}
