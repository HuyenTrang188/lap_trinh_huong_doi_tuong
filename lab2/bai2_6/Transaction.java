package bai2_6;

public final class Transaction {
    private final String transactionId;
    private final double amount;
    private final String timeStamp;

    public Transaction(String transactionId, double amount, String timeStamp) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.timeStamp = timeStamp;
    }

    public String getTransactionId() {
        return transactionId;
    }
    public double getAmount() {
        return amount;
    }
    public String getTimeStamp() {
        return timeStamp;
    }
}
