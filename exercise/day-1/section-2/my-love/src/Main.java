//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("1906355610");
        account.deposit(500);
        account.withdraw(100);
        account.getBalance();

        account.getAccountHolder();
        account.setAccountHolder("james");

        System.out.println("Current balance:" +account.getBalance());
        System.out.println("Balance: " + account.getBalance());
        System.out.println("Account Holder: " + account.getAccountHolder());

    }
}