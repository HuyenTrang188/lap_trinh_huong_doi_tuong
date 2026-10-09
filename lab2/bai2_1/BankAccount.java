package bai2_1;

public class BankAccount {

    private final String accountNumber;
    private double balance;

    private String ownerName;

    public BankAccount(String accountNumber, String ownerName) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = 0.0;
    }

    public BankAccount(String accountNumber, String ownerName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        
        if(initialBalance < 0) {
            this.balance = 0.0;
            System.out.println("loi");
        } else {
            this.balance = initialBalance;
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("so tien gui phai lon hon 0");

            
        }

    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        } else {
            System.out.println("so tien rut phai lon hon 0 va nho hon hoac bang so du hien tai");
            return false;
        }
    }

    public void getBalance() {
        System.out.println("so du hien tai " + balance);
    }


    public static void main(String[] args) {
      BankAccount account1 = new BankAccount("123456", "cyne");
      account1.getBalance();
      //gửi tiền
      account1.deposit(1000.0);
      account1.deposit(-500.0);
      account1.getBalance();
      //rút tiền
      account1.withdraw(20000.0);
      account1.withdraw(500.0);

      account1.getBalance();
    }

}
