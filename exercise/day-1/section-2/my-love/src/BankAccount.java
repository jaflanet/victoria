public class BankAccount {
    public String accountNumber;
    private double balance;
    private String accountHolder;

    public BankAccount(String accountNumber){
        this.balance=0.0;
    }
    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
        }
    }

    public void withdraw(double amount){
        if (amount > 0 && amount <=balance){
            balance-=amount;
        }
    }
    public double getBalance(){
        return balance;
    }
    public void setAccountHolder(String name){
        this.accountHolder= name;
    }

    public String getAccountHolder(){
        return accountHolder;
    }
}
