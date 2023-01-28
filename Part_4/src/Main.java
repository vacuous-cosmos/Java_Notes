public class Main {
    public static void main(String[] args) {
        Account artosAccount = new Account("Arto's account", 100.00);
        artosAccount.withdraw(10);
        artosAccount.deposit(20);
        artosAccount.balance();
    }
}