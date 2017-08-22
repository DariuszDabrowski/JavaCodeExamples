package Account;


public class Main {
    public static void main(String[] args) {
        Account account = new Account("PL4050", "Personal Account", 2300);
        Account account1 = new Account("BIEDA33", "Emerytalne", 500);
        System.out.println(account);
        account.credit(700);
        System.out.println(account);
        account.debit(250);
        System.out.println(account);
        System.out.println(account1);
        account.transferTo(account1, 1100);
        System.out.println(account);
        System.out.println(account1);

    }
}
