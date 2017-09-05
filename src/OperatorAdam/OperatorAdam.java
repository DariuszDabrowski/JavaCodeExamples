package OperatorAdam;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Darek on 2017-09-05.
 */
public class OperatorAdam implements IOperator {
    List<IService> services = new ArrayList<>();
    private String status = "";

    @Override
    public void registerObserver(IService service) {
        services.add(service);
    }

    @Override
    public void removeObserver(IService service) {
        services.remove(service);
    }

    @Override
    public void notifyObservers() {
        for (IService service : services) {
            service.update();
        }
    }

    @Override
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
        notifyObservers();
    }
}
