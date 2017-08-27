package CustomerAndAccount;

public class Main {

    public static void main(String[] args) {
        Account account = new Account(1,new Customer(22, "Joe",'m'),300);
        System.out.println(account);
        account.deposit(900);
        System.out.println(account);
    }
}
