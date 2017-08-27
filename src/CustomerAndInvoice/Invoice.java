package CustomerAndInvoice;

public class Invoice {

    private int ID;
    private Customer customer = new Customer(1, "Gienek", 10);
    private double amount;

    public Invoice(int ID, Customer customer, double amount){
        this.ID = ID;
        this.customer = customer;
        this.amount = amount;
    }

    public int getID() {
        return this.ID;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getAmount() {
       return this.amount = amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCustomerName() {
        return this.customer.getName();
    }

    public double getAmountAfterDiscount() {
        amount -= amount * customer.getDiscount()/100;
        return amount;
    }
}
