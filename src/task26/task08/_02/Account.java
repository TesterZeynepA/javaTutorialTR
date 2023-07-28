package task26.task08._02;

public class Account {

    private String accountNumber;
    private double balance;
    private double dailyWithdrawLimit=5000;

    public Account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount){
        balance+= amount;
        System.out.println(amount+ " TL deposited. New balance: " + balance);
    }


    public void withdraw(double amount){

        if(amount<=balance){
            if (amount<=dailyWithdrawLimit){
                balance-=amount;
                System.out.println(amount+ " TL withdrawn. New balance: " + balance);
            }else {
                System.out.println("Daily withdraw limit exceeded. You can only withdraw up to " + dailyWithdrawLimit + " TL.");
            }


        }else {
            System.out.println("Insufficient balance.");
        }

    }

    public double getBalance(){
        return balance;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

}