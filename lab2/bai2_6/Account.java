package bai2_6;

public class Account {
    private String accountId;
    private double balance;
    private Transaction[] history;
    private int transactionCount;

    public Account(String accountId, double initialBalance) {
        this.accountId = accountId;
        this.balance = initialBalance;
        this.history = new Transaction[100];
        this.transactionCount = 0;
    }

    public void addTransaction(Transaction t){
        if (transactionCount < history.length && t != null) {
            history[transactionCount] = t;
            transactionCount++;
        } else {
            System.out.println("Transaction history is full.");
        }
    }

    public Transaction[] getHistory() {
        Transaction[] copy = new Transaction[transactionCount];

        Transaction temp;
        for (int i = 0; i < transactionCount; i++) {
            temp = history[i];
            copy[i] = new Transaction(temp.getTransactionId(), temp.getAmount(), temp.getTimeStamp());
        }
        return copy;
    }

    public void displayHistory() {
        for (int i = 0; i < transactionCount; i++) {
            Transaction t = history[i];
            System.out.println("Transaction ID: " + t.getTransactionId() + ", Amount: " + t.getAmount() + ", Timestamp: " + t.getTimeStamp());
        }
    }


    public static void main(String[] args) {

        Account account = new Account("ACC001", 10000000);

        Transaction t1 = new Transaction(
            "T001",
            500000,
            "01/01/2026"
        );

        Transaction t2 = new Transaction(
            "T002",
            1000000,
            "02/01/2026"
        );

        account.addTransaction(t1);
        account.addTransaction(t2);

        System.out.println("Lich su ban dau:");
        account.displayHistory();
        // HACKER
        Transaction[] hackerHistory = account.getHistory();
        hackerHistory[0] = null;
        hackerHistory[1] = new Transaction("T999", 10000000, "03/01/2026");
        System.out.println("\nSau khi hacker sua ban sao:");
        System.out.println("Lich su that cua Account:");
        account.displayHistory();
    }
}


