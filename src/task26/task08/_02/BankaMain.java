package task26.task08._02;

import task26.task02.Account;

public class BankaMain {
    public static void main(String[] args) {
    task26.task02.Account customerAccount1 = new task26.task02.Account("12345",10000);
    task26.task02.Account customerAccount2 = new Account("67890",2000);

        System.out.println("Initial balances:");
        System.out.println(customerAccount1.getAccountNumber() + ": " + customerAccount1.getBalance());
        System.out.println(customerAccount2.getAccountNumber() + ": " + customerAccount2.getBalance());

        customerAccount1.deposit(500);
        customerAccount2.deposit(1000);

        customerAccount1.withdraw(3000); // Within daily limit
        customerAccount2.withdraw(1500); // Within daily limit

        customerAccount1.withdraw(6000); // Exceeds daily limit
        customerAccount2.withdraw(2500); // Within daily limit

        System.out.println("Final balances:");
        System.out.println(customerAccount1.getAccountNumber() + ": " + customerAccount1.getBalance());
        System.out.println(customerAccount2.getAccountNumber() + ": " + customerAccount2.getBalance());
}
}


