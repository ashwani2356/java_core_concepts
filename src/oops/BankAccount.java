package oops;

public class BankAccount {
    String name;
    String accountNumber;
    double balance;
    BankAccount(String name,String accountNumber,double balance){
        this.name=name;
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println(amount+" amount deposited successfully");
        }
        else{
            System.out.println("invalid deposit amount");
        }
    }
    void withdraw(double amount){
        if(amount <=balance && amount>0){
            balance-=amount;
            System.out.println(amount+" withdraw successfully");
        }
        else{
            System.out.println("insufficient balance or invalid amount");
        }
    }
    void displayBalance(){
        System.out.println("Current balance: "+balance);
    }
    public static void main(String[] args) {
        BankAccount account=new BankAccount("ashwani","23445443333",100);
        account.displayBalance();
        account.deposit(500);
        account.displayBalance();
        account.withdraw(100);
        account.displayBalance();
        account.withdraw(1);
    }
}
