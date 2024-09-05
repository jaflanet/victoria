//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.deposit(500);
        account.withdraw(100);
        System.out.println("Current balance:" +account.getBalance());
    }
}