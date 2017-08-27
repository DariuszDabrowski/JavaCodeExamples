package CustomerAndInvoice;

public class Main {

    public static void main(String[] args) {
        Invoice invoice = new Invoice(1, new Customer(234, "Zenek", 10), 1200);
        System.out.println(invoice.getAmount());
        System.out.println(invoice.getAmountAfterDiscount());
        System.out.println(invoice.getCustomer());
        System.out.println(invoice.getCustomerName());
        System.out.println(invoice.getID());
    }
}
