package CustomerAndAccount;

public class Account {

    private int ID;
    private Customer customer;
    private double balance = 0.0;

    public Account(int ID, Customer customer, double balance){
        this.ID = ID;
        this.customer = customer;
        this.balance = balance;
    }
    public Account(int ID, Customer customer){
        this.ID = ID;
        this.customer = customer;
    }

    public int getID() {return this.ID;}

    public Customer getCustomer() { return this.customer;}

    public double getBalance() {return  this.balance;}

    public void setBalance(double balance) {this.balance = balance;}

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(customer.toString())
                .append(" balance=$")
                .append(String.format("%.2f", balance));
        return sb.toString();
    }

    public String getCustomerName() {return this.customer.getName();}
    //powinno byc account
    public double deposit(double amount) {
        balance += amount;
        return balance;
    }
    public double withdraw(double amount) {
        if (balance >= amount)
            balance = balance - amount;
        else
            System.out.println("Amount Withdrawn exceeds the curent balance");
        return balance;
    }
}
