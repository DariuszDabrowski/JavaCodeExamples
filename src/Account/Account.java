package Account;


public class Account {

    private String _id;
    private String _name;
    private int _balance = 0;

    public Account(String id, String name){
        _id = id;
        _name = name;
    }
    public Account(String id, String name, int balance){
        _id = id;
        _name = name;
        _balance = balance;
    }
    public String getId() { return _id;}

    public String getName() { return _name;}

    public int getBalance() { return _balance;}

    public int credit(int amount) {
        _balance += amount;
        return _balance;
    }
    public int debit(int amount) {
        if (amount <= _balance)
            _balance -= amount;
        else
            System.out.println("Amount exceeded balance");
        return _balance;
    }
    public int transferTo(Account another, int amount){
        if (amount <= _balance){
        this._balance -= amount;
        another._balance += amount;
        } else {
            System.out.println("Account exceeded balance");
        }
        return _balance;
    }
    public String toString() {
        return String.format("Account[id=%s, name=%s, balance=%d]", _id, _name, _balance);
    }
}
