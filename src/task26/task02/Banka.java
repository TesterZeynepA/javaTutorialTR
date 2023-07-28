package task26.task02;

public class Banka {
    public static void main(String[] args) {
        // 1- bir Account sınıfı oluşturunuz, fieldları accountNumber ve balance (bakiye).
        // 2- bir consructor ekleyiniz.
        // 3- Account sınıfına deposit (ParaEkle) metodu ekleyiniz.
        // 4- Account sınıfına withdraw (ParaÇıkar) metodu ekleyiniz.
        // 5- withdraw de 5000 inin üzerine Günlük limiti aştınız uyarısı verelim
        // 6- main metodunda  account oluşturarak ihtimalleri deneyiniz.

        Account customerAccount1 = new Account("12345",10000);
        Account customerAccount2 = new Account("67890",2000);

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