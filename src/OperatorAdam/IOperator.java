package OperatorAdam;

public interface IOperator {
    void registerObserver(IService service);
    void removeObserver(IService service);
    void notifyObservers();
    String getStatus();
}
